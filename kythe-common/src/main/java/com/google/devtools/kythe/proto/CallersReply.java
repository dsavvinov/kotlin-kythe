// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/explore.proto

package com.google.devtools.kythe.proto;

/**
 * Protobuf type {@code kythe.proto.CallersReply}
 */
public  final class CallersReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kythe.proto.CallersReply)
    CallersReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CallersReply.newBuilder() to construct.
  private CallersReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CallersReply() {
    functionTicket_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CallersReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            functionTicket_ = s;
            break;
          }
          case 18: {
            com.google.devtools.kythe.proto.Graph.Builder subBuilder = null;
            if (graph_ != null) {
              subBuilder = graph_.toBuilder();
            }
            graph_ = input.readMessage(com.google.devtools.kythe.proto.Graph.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(graph_);
              graph_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_CallersReply_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_CallersReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.kythe.proto.CallersReply.class, com.google.devtools.kythe.proto.CallersReply.Builder.class);
  }

  public static final int FUNCTION_TICKET_FIELD_NUMBER = 1;
  private volatile java.lang.Object functionTicket_;
  /**
   * <pre>
   * same as function_ticket in request
   * </pre>
   *
   * <code>string function_ticket = 1;</code>
   */
  public java.lang.String getFunctionTicket() {
    java.lang.Object ref = functionTicket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      functionTicket_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * same as function_ticket in request
   * </pre>
   *
   * <code>string function_ticket = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFunctionTicketBytes() {
    java.lang.Object ref = functionTicket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      functionTicket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRAPH_FIELD_NUMBER = 2;
  private com.google.devtools.kythe.proto.Graph graph_;
  /**
   * <pre>
   * This is a graph, rather than a simple list of callers, to allow for
   * possible future expansion to recursive callers at depth &gt; 1.
   * </pre>
   *
   * <code>.kythe.proto.Graph graph = 2;</code>
   */
  public boolean hasGraph() {
    return graph_ != null;
  }
  /**
   * <pre>
   * This is a graph, rather than a simple list of callers, to allow for
   * possible future expansion to recursive callers at depth &gt; 1.
   * </pre>
   *
   * <code>.kythe.proto.Graph graph = 2;</code>
   */
  public com.google.devtools.kythe.proto.Graph getGraph() {
    return graph_ == null ? com.google.devtools.kythe.proto.Graph.getDefaultInstance() : graph_;
  }
  /**
   * <pre>
   * This is a graph, rather than a simple list of callers, to allow for
   * possible future expansion to recursive callers at depth &gt; 1.
   * </pre>
   *
   * <code>.kythe.proto.Graph graph = 2;</code>
   */
  public com.google.devtools.kythe.proto.GraphOrBuilder getGraphOrBuilder() {
    return getGraph();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFunctionTicketBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, functionTicket_);
    }
    if (graph_ != null) {
      output.writeMessage(2, getGraph());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFunctionTicketBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, functionTicket_);
    }
    if (graph_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGraph());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.devtools.kythe.proto.CallersReply)) {
      return super.equals(obj);
    }
    com.google.devtools.kythe.proto.CallersReply other = (com.google.devtools.kythe.proto.CallersReply) obj;

    boolean result = true;
    result = result && getFunctionTicket()
        .equals(other.getFunctionTicket());
    result = result && (hasGraph() == other.hasGraph());
    if (hasGraph()) {
      result = result && getGraph()
          .equals(other.getGraph());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FUNCTION_TICKET_FIELD_NUMBER;
    hash = (53 * hash) + getFunctionTicket().hashCode();
    if (hasGraph()) {
      hash = (37 * hash) + GRAPH_FIELD_NUMBER;
      hash = (53 * hash) + getGraph().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.kythe.proto.CallersReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.CallersReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.devtools.kythe.proto.CallersReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code kythe.proto.CallersReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kythe.proto.CallersReply)
      com.google.devtools.kythe.proto.CallersReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_CallersReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_CallersReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.kythe.proto.CallersReply.class, com.google.devtools.kythe.proto.CallersReply.Builder.class);
    }

    // Construct using com.google.devtools.kythe.proto.CallersReply.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      functionTicket_ = "";

      if (graphBuilder_ == null) {
        graph_ = null;
      } else {
        graph_ = null;
        graphBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_CallersReply_descriptor;
    }

    public com.google.devtools.kythe.proto.CallersReply getDefaultInstanceForType() {
      return com.google.devtools.kythe.proto.CallersReply.getDefaultInstance();
    }

    public com.google.devtools.kythe.proto.CallersReply build() {
      com.google.devtools.kythe.proto.CallersReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.kythe.proto.CallersReply buildPartial() {
      com.google.devtools.kythe.proto.CallersReply result = new com.google.devtools.kythe.proto.CallersReply(this);
      result.functionTicket_ = functionTicket_;
      if (graphBuilder_ == null) {
        result.graph_ = graph_;
      } else {
        result.graph_ = graphBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.kythe.proto.CallersReply) {
        return mergeFrom((com.google.devtools.kythe.proto.CallersReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.kythe.proto.CallersReply other) {
      if (other == com.google.devtools.kythe.proto.CallersReply.getDefaultInstance()) return this;
      if (!other.getFunctionTicket().isEmpty()) {
        functionTicket_ = other.functionTicket_;
        onChanged();
      }
      if (other.hasGraph()) {
        mergeGraph(other.getGraph());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.devtools.kythe.proto.CallersReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.kythe.proto.CallersReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object functionTicket_ = "";
    /**
     * <pre>
     * same as function_ticket in request
     * </pre>
     *
     * <code>string function_ticket = 1;</code>
     */
    public java.lang.String getFunctionTicket() {
      java.lang.Object ref = functionTicket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        functionTicket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * same as function_ticket in request
     * </pre>
     *
     * <code>string function_ticket = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFunctionTicketBytes() {
      java.lang.Object ref = functionTicket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        functionTicket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * same as function_ticket in request
     * </pre>
     *
     * <code>string function_ticket = 1;</code>
     */
    public Builder setFunctionTicket(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      functionTicket_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * same as function_ticket in request
     * </pre>
     *
     * <code>string function_ticket = 1;</code>
     */
    public Builder clearFunctionTicket() {
      
      functionTicket_ = getDefaultInstance().getFunctionTicket();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * same as function_ticket in request
     * </pre>
     *
     * <code>string function_ticket = 1;</code>
     */
    public Builder setFunctionTicketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      functionTicket_ = value;
      onChanged();
      return this;
    }

    private com.google.devtools.kythe.proto.Graph graph_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.kythe.proto.Graph, com.google.devtools.kythe.proto.Graph.Builder, com.google.devtools.kythe.proto.GraphOrBuilder> graphBuilder_;
    /**
     * <pre>
     * This is a graph, rather than a simple list of callers, to allow for
     * possible future expansion to recursive callers at depth &gt; 1.
     * </pre>
     *
     * <code>.kythe.proto.Graph graph = 2;</code>
     */
    public boolean hasGraph() {
      return graphBuilder_ != null || graph_ != null;
    }
    /**
     * <pre>
     * This is a graph, rather than a simple list of callers, to allow for
     * possible future expansion to recursive callers at depth &gt; 1.
     * </pre>
     *
     * <code>.kythe.proto.Graph graph = 2;</code>
     */
    public com.google.devtools.kythe.proto.Graph getGraph() {
      if (graphBuilder_ == null) {
        return graph_ == null ? com.google.devtools.kythe.proto.Graph.getDefaultInstance() : graph_;
      } else {
        return graphBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This is a graph, rather than a simple list of callers, to allow for
     * possible future expansion to recursive callers at depth &gt; 1.
     * </pre>
     *
     * <code>.kythe.proto.Graph graph = 2;</code>
     */
    public Builder setGraph(com.google.devtools.kythe.proto.Graph value) {
      if (graphBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        graph_ = value;
        onChanged();
      } else {
        graphBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * This is a graph, rather than a simple list of callers, to allow for
     * possible future expansion to recursive callers at depth &gt; 1.
     * </pre>
     *
     * <code>.kythe.proto.Graph graph = 2;</code>
     */
    public Builder setGraph(
        com.google.devtools.kythe.proto.Graph.Builder builderForValue) {
      if (graphBuilder_ == null) {
        graph_ = builderForValue.build();
        onChanged();
      } else {
        graphBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * This is a graph, rather than a simple list of callers, to allow for
     * possible future expansion to recursive callers at depth &gt; 1.
     * </pre>
     *
     * <code>.kythe.proto.Graph graph = 2;</code>
     */
    public Builder mergeGraph(com.google.devtools.kythe.proto.Graph value) {
      if (graphBuilder_ == null) {
        if (graph_ != null) {
          graph_ =
            com.google.devtools.kythe.proto.Graph.newBuilder(graph_).mergeFrom(value).buildPartial();
        } else {
          graph_ = value;
        }
        onChanged();
      } else {
        graphBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * This is a graph, rather than a simple list of callers, to allow for
     * possible future expansion to recursive callers at depth &gt; 1.
     * </pre>
     *
     * <code>.kythe.proto.Graph graph = 2;</code>
     */
    public Builder clearGraph() {
      if (graphBuilder_ == null) {
        graph_ = null;
        onChanged();
      } else {
        graph_ = null;
        graphBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * This is a graph, rather than a simple list of callers, to allow for
     * possible future expansion to recursive callers at depth &gt; 1.
     * </pre>
     *
     * <code>.kythe.proto.Graph graph = 2;</code>
     */
    public com.google.devtools.kythe.proto.Graph.Builder getGraphBuilder() {
      
      onChanged();
      return getGraphFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This is a graph, rather than a simple list of callers, to allow for
     * possible future expansion to recursive callers at depth &gt; 1.
     * </pre>
     *
     * <code>.kythe.proto.Graph graph = 2;</code>
     */
    public com.google.devtools.kythe.proto.GraphOrBuilder getGraphOrBuilder() {
      if (graphBuilder_ != null) {
        return graphBuilder_.getMessageOrBuilder();
      } else {
        return graph_ == null ?
            com.google.devtools.kythe.proto.Graph.getDefaultInstance() : graph_;
      }
    }
    /**
     * <pre>
     * This is a graph, rather than a simple list of callers, to allow for
     * possible future expansion to recursive callers at depth &gt; 1.
     * </pre>
     *
     * <code>.kythe.proto.Graph graph = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.kythe.proto.Graph, com.google.devtools.kythe.proto.Graph.Builder, com.google.devtools.kythe.proto.GraphOrBuilder> 
        getGraphFieldBuilder() {
      if (graphBuilder_ == null) {
        graphBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.kythe.proto.Graph, com.google.devtools.kythe.proto.Graph.Builder, com.google.devtools.kythe.proto.GraphOrBuilder>(
                getGraph(),
                getParentForChildren(),
                isClean());
        graph_ = null;
      }
      return graphBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kythe.proto.CallersReply)
  }

  // @@protoc_insertion_point(class_scope:kythe.proto.CallersReply)
  private static final com.google.devtools.kythe.proto.CallersReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.kythe.proto.CallersReply();
  }

  public static com.google.devtools.kythe.proto.CallersReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CallersReply>
      PARSER = new com.google.protobuf.AbstractParser<CallersReply>() {
    public CallersReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CallersReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CallersReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CallersReply> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.kythe.proto.CallersReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

