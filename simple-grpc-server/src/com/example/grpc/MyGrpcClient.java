/*
 *  MyGrpcClient.java
 *
 *  Created on: 20 Feb 2019
 *      Author: dkelly
 */

package com.example.grpc;

import com.example.grpc.GreetingServiceGrpc;
import com.example.grpc.HelloRequest;
import com.example.grpc.HelloResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MyGrpcClient {

	public static void main(String[] args)  throws InterruptedException {

		System.out.println("Creating Channel to Server\n");
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
				.usePlaintext(true)
				.build();
		
		GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);

		HelloResponse response = stub.greet(HelloRequest.newBuilder().setFirstname("Dermot").addHobbies("Photography").build());
		System.out.println(response);
	}

}
