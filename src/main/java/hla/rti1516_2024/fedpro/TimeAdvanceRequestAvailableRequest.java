// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest}
 */
public final class TimeAdvanceRequestAvailableRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest)
    TimeAdvanceRequestAvailableRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      TimeAdvanceRequestAvailableRequest.class.getName());
  }
  // Use TimeAdvanceRequestAvailableRequest.newBuilder() to construct.
  private TimeAdvanceRequestAvailableRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TimeAdvanceRequestAvailableRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_TimeAdvanceRequestAvailableRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_TimeAdvanceRequestAvailableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest.class, hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TIME_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.LogicalTime time_;
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
   * @return Whether the time field is set.
   */
  @java.lang.Override
  public boolean hasTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
   * @return The time.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.LogicalTime getTime() {
    return time_ == null ? hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance() : time_;
  }
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.LogicalTimeOrBuilder getTimeOrBuilder() {
    return time_ == null ? hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance() : time_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTime());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest other = (hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest) obj;

    if (hasTime() != other.hasTime()) return false;
    if (hasTime()) {
      if (!getTime()
          .equals(other.getTime())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest)
      hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_TimeAdvanceRequestAvailableRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_TimeAdvanceRequestAvailableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest.class, hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        internalGetTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_TimeAdvanceRequestAvailableRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest build() {
      hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest buildPartial() {
      hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest result = new hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.time_ = timeBuilder_ == null
            ? time_
            : timeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest other) {
      if (other == hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest.getDefaultInstance()) return this;
      if (other.hasTime()) {
        mergeTime(other.getTime());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  internalGetTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private hla.rti1516_2024.fedpro.LogicalTime time_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.LogicalTime, hla.rti1516_2024.fedpro.LogicalTime.Builder, hla.rti1516_2024.fedpro.LogicalTimeOrBuilder> timeBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
     * @return Whether the time field is set.
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
     * @return The time.
     */
    public hla.rti1516_2024.fedpro.LogicalTime getTime() {
      if (timeBuilder_ == null) {
        return time_ == null ? hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance() : time_;
      } else {
        return timeBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
     */
    public Builder setTime(hla.rti1516_2024.fedpro.LogicalTime value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
      } else {
        timeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
     */
    public Builder setTime(
        hla.rti1516_2024.fedpro.LogicalTime.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
     */
    public Builder mergeTime(hla.rti1516_2024.fedpro.LogicalTime value) {
      if (timeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          time_ != null &&
          time_ != hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance()) {
          getTimeBuilder().mergeFrom(value);
        } else {
          time_ = value;
        }
      } else {
        timeBuilder_.mergeFrom(value);
      }
      if (time_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
     */
    public Builder clearTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
     */
    public hla.rti1516_2024.fedpro.LogicalTime.Builder getTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
     */
    public hla.rti1516_2024.fedpro.LogicalTimeOrBuilder getTimeOrBuilder() {
      if (timeBuilder_ != null) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        return time_ == null ?
            hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance() : time_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.LogicalTime, hla.rti1516_2024.fedpro.LogicalTime.Builder, hla.rti1516_2024.fedpro.LogicalTimeOrBuilder> 
        internalGetTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.LogicalTime, hla.rti1516_2024.fedpro.LogicalTime.Builder, hla.rti1516_2024.fedpro.LogicalTimeOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest)
  private static final hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest();
  }

  public static hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeAdvanceRequestAvailableRequest>
      PARSER = new com.google.protobuf.AbstractParser<TimeAdvanceRequestAvailableRequest>() {
    @java.lang.Override
    public TimeAdvanceRequestAvailableRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TimeAdvanceRequestAvailableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeAdvanceRequestAvailableRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.TimeAdvanceRequestAvailableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

