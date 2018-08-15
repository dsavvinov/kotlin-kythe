// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/explore.proto

package com.google.devtools.kythe.proto;

/**
 * <pre>
 * Fetches the tickets for which the specified ticket is the enclosing context
 * (e.g. what files are in this package?  what functions are in this class?).
 * </pre>
 *
 * Protobuf type {@code kythe.proto.ChildrenRequest}
 */
public  final class ChildrenRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kythe.proto.ChildrenRequest)
    ChildrenRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChildrenRequest.newBuilder() to construct.
  private ChildrenRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChildrenRequest() {
    ticket_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChildrenRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              ticket_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            ticket_.add(s);
            break;
          }
          case 18: {
            com.google.devtools.kythe.proto.NodeFilter.Builder subBuilder = null;
            if (nodeFilter_ != null) {
              subBuilder = nodeFilter_.toBuilder();
            }
            nodeFilter_ = input.readMessage(com.google.devtools.kythe.proto.NodeFilter.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nodeFilter_);
              nodeFilter_ = subBuilder.buildPartial();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        ticket_ = ticket_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_ChildrenRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_ChildrenRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.kythe.proto.ChildrenRequest.class, com.google.devtools.kythe.proto.ChildrenRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TICKET_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList ticket_;
  /**
   * <code>repeated string ticket = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getTicketList() {
    return ticket_;
  }
  /**
   * <code>repeated string ticket = 1;</code>
   */
  public int getTicketCount() {
    return ticket_.size();
  }
  /**
   * <code>repeated string ticket = 1;</code>
   */
  public java.lang.String getTicket(int index) {
    return ticket_.get(index);
  }
  /**
   * <code>repeated string ticket = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTicketBytes(int index) {
    return ticket_.getByteString(index);
  }

  public static final int NODE_FILTER_FIELD_NUMBER = 2;
  private com.google.devtools.kythe.proto.NodeFilter nodeFilter_;
  /**
   * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
   */
  public boolean hasNodeFilter() {
    return nodeFilter_ != null;
  }
  /**
   * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
   */
  public com.google.devtools.kythe.proto.NodeFilter getNodeFilter() {
    return nodeFilter_ == null ? com.google.devtools.kythe.proto.NodeFilter.getDefaultInstance() : nodeFilter_;
  }
  /**
   * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
   */
  public com.google.devtools.kythe.proto.NodeFilterOrBuilder getNodeFilterOrBuilder() {
    return getNodeFilter();
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
    for (int i = 0; i < ticket_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ticket_.getRaw(i));
    }
    if (nodeFilter_ != null) {
      output.writeMessage(2, getNodeFilter());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ticket_.size(); i++) {
        dataSize += computeStringSizeNoTag(ticket_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTicketList().size();
    }
    if (nodeFilter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNodeFilter());
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
    if (!(obj instanceof com.google.devtools.kythe.proto.ChildrenRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.kythe.proto.ChildrenRequest other = (com.google.devtools.kythe.proto.ChildrenRequest) obj;

    boolean result = true;
    result = result && getTicketList()
        .equals(other.getTicketList());
    result = result && (hasNodeFilter() == other.hasNodeFilter());
    if (hasNodeFilter()) {
      result = result && getNodeFilter()
          .equals(other.getNodeFilter());
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
    if (getTicketCount() > 0) {
      hash = (37 * hash) + TICKET_FIELD_NUMBER;
      hash = (53 * hash) + getTicketList().hashCode();
    }
    if (hasNodeFilter()) {
      hash = (37 * hash) + NODE_FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getNodeFilter().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.kythe.proto.ChildrenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.ChildrenRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.kythe.proto.ChildrenRequest prototype) {
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
   * <pre>
   * Fetches the tickets for which the specified ticket is the enclosing context
   * (e.g. what files are in this package?  what functions are in this class?).
   * </pre>
   *
   * Protobuf type {@code kythe.proto.ChildrenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kythe.proto.ChildrenRequest)
      com.google.devtools.kythe.proto.ChildrenRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_ChildrenRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_ChildrenRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.kythe.proto.ChildrenRequest.class, com.google.devtools.kythe.proto.ChildrenRequest.Builder.class);
    }

    // Construct using com.google.devtools.kythe.proto.ChildrenRequest.newBuilder()
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
      ticket_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (nodeFilterBuilder_ == null) {
        nodeFilter_ = null;
      } else {
        nodeFilter_ = null;
        nodeFilterBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_ChildrenRequest_descriptor;
    }

    public com.google.devtools.kythe.proto.ChildrenRequest getDefaultInstanceForType() {
      return com.google.devtools.kythe.proto.ChildrenRequest.getDefaultInstance();
    }

    public com.google.devtools.kythe.proto.ChildrenRequest build() {
      com.google.devtools.kythe.proto.ChildrenRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.kythe.proto.ChildrenRequest buildPartial() {
      com.google.devtools.kythe.proto.ChildrenRequest result = new com.google.devtools.kythe.proto.ChildrenRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        ticket_ = ticket_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ticket_ = ticket_;
      if (nodeFilterBuilder_ == null) {
        result.nodeFilter_ = nodeFilter_;
      } else {
        result.nodeFilter_ = nodeFilterBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.devtools.kythe.proto.ChildrenRequest) {
        return mergeFrom((com.google.devtools.kythe.proto.ChildrenRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.kythe.proto.ChildrenRequest other) {
      if (other == com.google.devtools.kythe.proto.ChildrenRequest.getDefaultInstance()) return this;
      if (!other.ticket_.isEmpty()) {
        if (ticket_.isEmpty()) {
          ticket_ = other.ticket_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTicketIsMutable();
          ticket_.addAll(other.ticket_);
        }
        onChanged();
      }
      if (other.hasNodeFilter()) {
        mergeNodeFilter(other.getNodeFilter());
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
      com.google.devtools.kythe.proto.ChildrenRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.kythe.proto.ChildrenRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList ticket_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTicketIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ticket_ = new com.google.protobuf.LazyStringArrayList(ticket_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string ticket = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTicketList() {
      return ticket_.getUnmodifiableView();
    }
    /**
     * <code>repeated string ticket = 1;</code>
     */
    public int getTicketCount() {
      return ticket_.size();
    }
    /**
     * <code>repeated string ticket = 1;</code>
     */
    public java.lang.String getTicket(int index) {
      return ticket_.get(index);
    }
    /**
     * <code>repeated string ticket = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTicketBytes(int index) {
      return ticket_.getByteString(index);
    }
    /**
     * <code>repeated string ticket = 1;</code>
     */
    public Builder setTicket(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTicketIsMutable();
      ticket_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ticket = 1;</code>
     */
    public Builder addTicket(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTicketIsMutable();
      ticket_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ticket = 1;</code>
     */
    public Builder addAllTicket(
        java.lang.Iterable<java.lang.String> values) {
      ensureTicketIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ticket_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ticket = 1;</code>
     */
    public Builder clearTicket() {
      ticket_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ticket = 1;</code>
     */
    public Builder addTicketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTicketIsMutable();
      ticket_.add(value);
      onChanged();
      return this;
    }

    private com.google.devtools.kythe.proto.NodeFilter nodeFilter_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.kythe.proto.NodeFilter, com.google.devtools.kythe.proto.NodeFilter.Builder, com.google.devtools.kythe.proto.NodeFilterOrBuilder> nodeFilterBuilder_;
    /**
     * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
     */
    public boolean hasNodeFilter() {
      return nodeFilterBuilder_ != null || nodeFilter_ != null;
    }
    /**
     * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
     */
    public com.google.devtools.kythe.proto.NodeFilter getNodeFilter() {
      if (nodeFilterBuilder_ == null) {
        return nodeFilter_ == null ? com.google.devtools.kythe.proto.NodeFilter.getDefaultInstance() : nodeFilter_;
      } else {
        return nodeFilterBuilder_.getMessage();
      }
    }
    /**
     * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
     */
    public Builder setNodeFilter(com.google.devtools.kythe.proto.NodeFilter value) {
      if (nodeFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nodeFilter_ = value;
        onChanged();
      } else {
        nodeFilterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
     */
    public Builder setNodeFilter(
        com.google.devtools.kythe.proto.NodeFilter.Builder builderForValue) {
      if (nodeFilterBuilder_ == null) {
        nodeFilter_ = builderForValue.build();
        onChanged();
      } else {
        nodeFilterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
     */
    public Builder mergeNodeFilter(com.google.devtools.kythe.proto.NodeFilter value) {
      if (nodeFilterBuilder_ == null) {
        if (nodeFilter_ != null) {
          nodeFilter_ =
            com.google.devtools.kythe.proto.NodeFilter.newBuilder(nodeFilter_).mergeFrom(value).buildPartial();
        } else {
          nodeFilter_ = value;
        }
        onChanged();
      } else {
        nodeFilterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
     */
    public Builder clearNodeFilter() {
      if (nodeFilterBuilder_ == null) {
        nodeFilter_ = null;
        onChanged();
      } else {
        nodeFilter_ = null;
        nodeFilterBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
     */
    public com.google.devtools.kythe.proto.NodeFilter.Builder getNodeFilterBuilder() {
      
      onChanged();
      return getNodeFilterFieldBuilder().getBuilder();
    }
    /**
     * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
     */
    public com.google.devtools.kythe.proto.NodeFilterOrBuilder getNodeFilterOrBuilder() {
      if (nodeFilterBuilder_ != null) {
        return nodeFilterBuilder_.getMessageOrBuilder();
      } else {
        return nodeFilter_ == null ?
            com.google.devtools.kythe.proto.NodeFilter.getDefaultInstance() : nodeFilter_;
      }
    }
    /**
     * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.kythe.proto.NodeFilter, com.google.devtools.kythe.proto.NodeFilter.Builder, com.google.devtools.kythe.proto.NodeFilterOrBuilder> 
        getNodeFilterFieldBuilder() {
      if (nodeFilterBuilder_ == null) {
        nodeFilterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.kythe.proto.NodeFilter, com.google.devtools.kythe.proto.NodeFilter.Builder, com.google.devtools.kythe.proto.NodeFilterOrBuilder>(
                getNodeFilter(),
                getParentForChildren(),
                isClean());
        nodeFilter_ = null;
      }
      return nodeFilterBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kythe.proto.ChildrenRequest)
  }

  // @@protoc_insertion_point(class_scope:kythe.proto.ChildrenRequest)
  private static final com.google.devtools.kythe.proto.ChildrenRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.kythe.proto.ChildrenRequest();
  }

  public static com.google.devtools.kythe.proto.ChildrenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChildrenRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChildrenRequest>() {
    public ChildrenRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChildrenRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChildrenRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChildrenRequest> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.kythe.proto.ChildrenRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

