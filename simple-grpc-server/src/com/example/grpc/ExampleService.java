// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExampleService.proto

package com.example.grpc;

public final class ExampleService {
  private ExampleService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_HelloRequest_BagOfTricksEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_HelloRequest_BagOfTricksEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ExampleService.proto\022\020com.example.grpc" +
      "\"\373\001\n\014HelloRequest\022\021\n\tfirstname\030\001 \001(\t\022\020\n\010" +
      "lastname\030\002 \001(\t\022\013\n\003age\030\003 \001(\003\022\017\n\007hobbies\030\004" +
      " \003(\t\022D\n\013bagOfTricks\030\005 \003(\0132/.com.example." +
      "grpc.HelloRequest.BagOfTricksEntry\022.\n\tse" +
      "ntiment\030\006 \001(\0162\033.com.example.grpc.Sentime" +
      "nt\0322\n\020BagOfTricksEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v" +
      "alue\030\002 \001(\t:\0028\001\"!\n\rHelloResponse\022\020\n\010greet" +
      "ing\030\001 \001(\t*8\n\tSentiment\022\t\n\005HAPPY\020\000\022\n\n\006SLE" +
      "EPY\020\001\022\t\n\005DRUNK\020\002\022\t\n\005ANGRY\020\0032[\n\017GreetingS" +
      "ervice\022H\n\005greet\022\036.com.example.grpc.Hello" +
      "Request\032\037.com.example.grpc.HelloResponse" +
      "B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpc_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_HelloRequest_descriptor,
        new java.lang.String[] { "Firstname", "Lastname", "Age", "Hobbies", "BagOfTricks", "Sentiment", });
    internal_static_com_example_grpc_HelloRequest_BagOfTricksEntry_descriptor =
      internal_static_com_example_grpc_HelloRequest_descriptor.getNestedTypes().get(0);
    internal_static_com_example_grpc_HelloRequest_BagOfTricksEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_HelloRequest_BagOfTricksEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_example_grpc_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
