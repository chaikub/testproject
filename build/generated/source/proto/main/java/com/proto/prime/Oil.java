// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Oil.proto

package com.proto.prime;

public final class Oil {
  private Oil() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddOilToFavoriteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddOilToFavoriteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryFavOilRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QueryFavOilRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryFavOilResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QueryFavOilResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddOilToFavoriteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddOilToFavoriteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RemoveOilFromFavoriteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RemoveOilFromFavoriteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RemoveOilFromFavoriteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RemoveOilFromFavoriteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tOil.proto\"9\n\027AddOilToFavoriteRequest\022\020" +
      "\n\010username\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\"&\n\022QueryF" +
      "avOilRequest\022\020\n\010username\030\001 \001(\t\"#\n\023QueryF" +
      "avOilResponse\022\014\n\004name\030\001 \003(\t\"-\n\030AddOilToF" +
      "avoriteResponse\022\021\n\tisSuccess\030\001 \001(\010\">\n\034Re" +
      "moveOilFromFavoriteRequest\022\020\n\010username\030\001" +
      " \001(\t\022\014\n\004name\030\002 \001(\t\"2\n\035RemoveOilFromFavor" +
      "iteResponse\022\021\n\tisSuccess\030\001 \001(\0102\344\001\n\nOilSe" +
      "rvice\022I\n\020AddOilToFavorite\022\030.AddOilToFavo" +
      "riteRequest\032\031.AddOilToFavoriteResponse\"\000" +
      "\022O\n\014RemoveFavOil\022\035.RemoveOilFromFavorite" +
      "Request\032\036.RemoveOilFromFavoriteResponse\"" +
      "\000\022:\n\013QueryFavOil\022\023.QueryFavOilRequest\032\024." +
      "QueryFavOilResponse\"\000B\023\n\017com.proto.prime" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AddOilToFavoriteRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AddOilToFavoriteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddOilToFavoriteRequest_descriptor,
        new java.lang.String[] { "Username", "Name", });
    internal_static_QueryFavOilRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_QueryFavOilRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QueryFavOilRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_QueryFavOilResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_QueryFavOilResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QueryFavOilResponse_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_AddOilToFavoriteResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AddOilToFavoriteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddOilToFavoriteResponse_descriptor,
        new java.lang.String[] { "IsSuccess", });
    internal_static_RemoveOilFromFavoriteRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_RemoveOilFromFavoriteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RemoveOilFromFavoriteRequest_descriptor,
        new java.lang.String[] { "Username", "Name", });
    internal_static_RemoveOilFromFavoriteResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_RemoveOilFromFavoriteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RemoveOilFromFavoriteResponse_descriptor,
        new java.lang.String[] { "IsSuccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
