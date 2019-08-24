/*
 * PthreadBarrier.c
 *
 *  Created on: 19 Mar 2018
 *      Author: dkelly
 */

#include <pthread.h>
#include <stdlib.h>
#include <stdio.h>

/* Demonstration of use of Barrier function in a phased computation */

#define THREADS 10 /* say 10 threads to be created */

/* Declare global data structures to be partitioned
 * among threads for computational task here */

// A Barrier variable is needed to synchronise phases of the computation
pthread_barrier_t  barr;

void* computational_task(void* arg)
{

 /* Each thread determines its id and workload from arg and
  * executes first stage of computationally intensive task */
	printf("I am thread %d\n", *(int *)arg);

 /* Synchronization point – All threads associated with the barrier are blocked here until
  * all threads have executed pthread_barrier_wait.
  * Only one thread is given the PTHREAD_BARRIER_SERIAL_THREAD return value,
  * the others receive 0 when the barrier function is complete. */
    int rc = pthread_barrier_wait(&barr);

    if(rc != 0 && rc != PTHREAD_BARRIER_SERIAL_THREAD)
    {
        printf("Could not wait on barrier\n");
        exit(-1);
    }
    else if ( rc == PTHREAD_BARRIER_SERIAL_THREAD )
    {
    	printf("Last thread %d destroying the barrier\n", *(int *)arg);
        pthread_barrier_destroy(&barr); /* Only one thread does this */
    }

 /* Each thread moves on to second stage of algorithm
  * when all threads have completed first stage*/
   return NULL;
}


int main(int argc, char **argv)
{
    pthread_t thr[THREADS];
	int threadargs[THREADS];

    // Barrier initialization
    if(pthread_barrier_init(&barr, NULL, THREADS))
    {
        printf("Could not create a barrier\n");
        return -1;
    }

    for(int i = 0; i < THREADS; ++i)
    {
    	threadargs[i] = i;
        if(pthread_create(&thr[i], NULL, &computational_task, &threadargs[i]))
        {
            printf("Could not create thread %d\n", i);
            return -1;
        }
    }

    for(int i = 0; i < THREADS; ++i)
    {
        if(pthread_join(thr[i], NULL))
        {
            printf("Could not join thread %d\n", i);
            return -1;
        }
        else
        	printf("Joined thread %d\n", i);
    }

    printf("Computation complete\n");

    return 0;
}


