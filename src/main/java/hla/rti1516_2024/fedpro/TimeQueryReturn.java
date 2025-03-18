// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: datatypes.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.TimeQueryReturn}
 */
public final class TimeQueryReturn extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.TimeQueryReturn)
    TimeQueryReturnOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      TimeQueryReturn.class.getName());
  }
  // Use TimeQueryReturn.newBuilder() to construct.
  private TimeQueryReturn(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TimeQueryReturn() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_TimeQueryReturn_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_TimeQueryReturn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.TimeQueryReturn.class, hla.rti1516_2024.fedpro.TimeQueryReturn.Builder.class);
  }

  private int bitField0_;
  public static final int LOGICALTIMEISVALID_FIELD_NUMBER = 1;
  private boolean logicalTimeIsValid_ = false;
  /**
   * <code>bool logicalTimeIsValid = 1;</code>
   * @return The logicalTimeIsValid.
   */
  @java.lang.Override
  public boolean getLogicalTimeIsValid() {
    return logicalTimeIsValid_;
  }

  public static final int LOGICALTIME_FIELD_NUMBER = 2;
  private hla.rti1516_2024.fedpro.LogicalTime logicalTime_;
  /**
   * <pre>
   * optional, only valid if logicalTimeIsValid == true
   * </pre>
   *
   * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
   * @return Whether the logicalTime field is set.
   */
  @java.lang.Override
  public boolean hasLogicalTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * optional, only valid if logicalTimeIsValid == true
   * </pre>
   *
   * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
   * @return The logicalTime.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.LogicalTime getLogicalTime() {
    return logicalTime_ == null ? hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance() : logicalTime_;
  }
  /**
   * <pre>
   * optional, only valid if logicalTimeIsValid == true
   * </pre>
   *
   * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.LogicalTimeOrBuilder getLogicalTimeOrBuilder() {
    return logicalTime_ == null ? hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance() : logicalTime_;
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
    if (logicalTimeIsValid_ != false) {
      output.writeBool(1, logicalTimeIsValid_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getLogicalTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (logicalTimeIsValid_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, logicalTimeIsValid_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLogicalTime());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.TimeQueryReturn)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.TimeQueryReturn other = (hla.rti1516_2024.fedpro.TimeQueryReturn) obj;

    if (getLogicalTimeIsValid()
        != other.getLogicalTimeIsValid()) return false;
    if (hasLogicalTime() != other.hasLogicalTime()) return false;
    if (hasLogicalTime()) {
      if (!getLogicalTime()
          .equals(other.getLogicalTime())) return false;
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
    hash = (37 * hash) + LOGICALTIMEISVALID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLogicalTimeIsValid());
    if (hasLogicalTime()) {
      hash = (37 * hash) + LOGICALTIME_FIELD_NUMBER;
      hash = (53 * hash) + getLogicalTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.TimeQueryReturn parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.TimeQueryReturn prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.TimeQueryReturn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.TimeQueryReturn)
      hla.rti1516_2024.fedpro.TimeQueryReturnOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_TimeQueryReturn_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_TimeQueryReturn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.TimeQueryReturn.class, hla.rti1516_2024.fedpro.TimeQueryReturn.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.TimeQueryReturn.newBuilder()
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
        internalGetLogicalTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      logicalTimeIsValid_ = false;
      logicalTime_ = null;
      if (logicalTimeBuilder_ != null) {
        logicalTimeBuilder_.dispose();
        logicalTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_TimeQueryReturn_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.TimeQueryReturn getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.TimeQueryReturn.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.TimeQueryReturn build() {
      hla.rti1516_2024.fedpro.TimeQueryReturn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.TimeQueryReturn buildPartial() {
      hla.rti1516_2024.fedpro.TimeQueryReturn result = new hla.rti1516_2024.fedpro.TimeQueryReturn(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.TimeQueryReturn result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.logicalTimeIsValid_ = logicalTimeIsValid_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.logicalTime_ = logicalTimeBuilder_ == null
            ? logicalTime_
            : logicalTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.TimeQueryReturn) {
        return mergeFrom((hla.rti1516_2024.fedpro.TimeQueryReturn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.TimeQueryReturn other) {
      if (other == hla.rti1516_2024.fedpro.TimeQueryReturn.getDefaultInstance()) return this;
      if (other.getLogicalTimeIsValid() != false) {
        setLogicalTimeIsValid(other.getLogicalTimeIsValid());
      }
      if (other.hasLogicalTime()) {
        mergeLogicalTime(other.getLogicalTime());
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
            case 8: {
              logicalTimeIsValid_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  internalGetLogicalTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private boolean logicalTimeIsValid_ ;
    /**
     * <code>bool logicalTimeIsValid = 1;</code>
     * @return The logicalTimeIsValid.
     */
    @java.lang.Override
    public boolean getLogicalTimeIsValid() {
      return logicalTimeIsValid_;
    }
    /**
     * <code>bool logicalTimeIsValid = 1;</code>
     * @param value The logicalTimeIsValid to set.
     * @return This builder for chaining.
     */
    public Builder setLogicalTimeIsValid(boolean value) {

      logicalTimeIsValid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool logicalTimeIsValid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogicalTimeIsValid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      logicalTimeIsValid_ = false;
      onChanged();
      return this;
    }

    private hla.rti1516_2024.fedpro.LogicalTime logicalTime_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.LogicalTime, hla.rti1516_2024.fedpro.LogicalTime.Builder, hla.rti1516_2024.fedpro.LogicalTimeOrBuilder> logicalTimeBuilder_;
    /**
     * <pre>
     * optional, only valid if logicalTimeIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
     * @return Whether the logicalTime field is set.
     */
    public boolean hasLogicalTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * optional, only valid if logicalTimeIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
     * @return The logicalTime.
     */
    public hla.rti1516_2024.fedpro.LogicalTime getLogicalTime() {
      if (logicalTimeBuilder_ == null) {
        return logicalTime_ == null ? hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance() : logicalTime_;
      } else {
        return logicalTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * optional, only valid if logicalTimeIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
     */
    public Builder setLogicalTime(hla.rti1516_2024.fedpro.LogicalTime value) {
      if (logicalTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        logicalTime_ = value;
      } else {
        logicalTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional, only valid if logicalTimeIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
     */
    public Builder setLogicalTime(
        hla.rti1516_2024.fedpro.LogicalTime.Builder builderForValue) {
      if (logicalTimeBuilder_ == null) {
        logicalTime_ = builderForValue.build();
      } else {
        logicalTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional, only valid if logicalTimeIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
     */
    public Builder mergeLogicalTime(hla.rti1516_2024.fedpro.LogicalTime value) {
      if (logicalTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          logicalTime_ != null &&
          logicalTime_ != hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance()) {
          getLogicalTimeBuilder().mergeFrom(value);
        } else {
          logicalTime_ = value;
        }
      } else {
        logicalTimeBuilder_.mergeFrom(value);
      }
      if (logicalTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * optional, only valid if logicalTimeIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
     */
    public Builder clearLogicalTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      logicalTime_ = null;
      if (logicalTimeBuilder_ != null) {
        logicalTimeBuilder_.dispose();
        logicalTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional, only valid if logicalTimeIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
     */
    public hla.rti1516_2024.fedpro.LogicalTime.Builder getLogicalTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return internalGetLogicalTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * optional, only valid if logicalTimeIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
     */
    public hla.rti1516_2024.fedpro.LogicalTimeOrBuilder getLogicalTimeOrBuilder() {
      if (logicalTimeBuilder_ != null) {
        return logicalTimeBuilder_.getMessageOrBuilder();
      } else {
        return logicalTime_ == null ?
            hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance() : logicalTime_;
      }
    }
    /**
     * <pre>
     * optional, only valid if logicalTimeIsValid == true
     * </pre>
     *
     * <code>.rti1516_2024.fedpro.LogicalTime logicalTime = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.LogicalTime, hla.rti1516_2024.fedpro.LogicalTime.Builder, hla.rti1516_2024.fedpro.LogicalTimeOrBuilder> 
        internalGetLogicalTimeFieldBuilder() {
      if (logicalTimeBuilder_ == null) {
        logicalTimeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.LogicalTime, hla.rti1516_2024.fedpro.LogicalTime.Builder, hla.rti1516_2024.fedpro.LogicalTimeOrBuilder>(
                getLogicalTime(),
                getParentForChildren(),
                isClean());
        logicalTime_ = null;
      }
      return logicalTimeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.TimeQueryReturn)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.TimeQueryReturn)
  private static final hla.rti1516_2024.fedpro.TimeQueryReturn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.TimeQueryReturn();
  }

  public static hla.rti1516_2024.fedpro.TimeQueryReturn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeQueryReturn>
      PARSER = new com.google.protobuf.AbstractParser<TimeQueryReturn>() {
    @java.lang.Override
    public TimeQueryReturn parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimeQueryReturn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeQueryReturn> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.TimeQueryReturn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

