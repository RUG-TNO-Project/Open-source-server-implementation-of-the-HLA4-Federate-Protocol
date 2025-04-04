// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest}
 */
public final class ChangeInteractionOrderTypeRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest)
    ChangeInteractionOrderTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      ChangeInteractionOrderTypeRequest.class.getName());
  }
  // Use ChangeInteractionOrderTypeRequest.newBuilder() to construct.
  private ChangeInteractionOrderTypeRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ChangeInteractionOrderTypeRequest() {
    orderType_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ChangeInteractionOrderTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ChangeInteractionOrderTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest.class, hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int INTERACTIONCLASS_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.InteractionClassHandle interactionClass_;
  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return Whether the interactionClass field is set.
   */
  @java.lang.Override
  public boolean hasInteractionClass() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return The interactionClass.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.InteractionClassHandle getInteractionClass() {
    return interactionClass_ == null ? hla.rti1516_2024.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
  }
  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder getInteractionClassOrBuilder() {
    return interactionClass_ == null ? hla.rti1516_2024.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
  }

  public static final int ORDERTYPE_FIELD_NUMBER = 2;
  private int orderType_ = 0;
  /**
   * <code>.rti1516_2024.fedpro.OrderType orderType = 2;</code>
   * @return The enum numeric value on the wire for orderType.
   */
  @java.lang.Override public int getOrderTypeValue() {
    return orderType_;
  }
  /**
   * <code>.rti1516_2024.fedpro.OrderType orderType = 2;</code>
   * @return The orderType.
   */
  @java.lang.Override public hla.rti1516_2024.fedpro.OrderType getOrderType() {
    hla.rti1516_2024.fedpro.OrderType result = hla.rti1516_2024.fedpro.OrderType.forNumber(orderType_);
    return result == null ? hla.rti1516_2024.fedpro.OrderType.UNRECOGNIZED : result;
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
      output.writeMessage(1, getInteractionClass());
    }
    if (orderType_ != hla.rti1516_2024.fedpro.OrderType.RECEIVE.getNumber()) {
      output.writeEnum(2, orderType_);
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
        .computeMessageSize(1, getInteractionClass());
    }
    if (orderType_ != hla.rti1516_2024.fedpro.OrderType.RECEIVE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, orderType_);
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest other = (hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest) obj;

    if (hasInteractionClass() != other.hasInteractionClass()) return false;
    if (hasInteractionClass()) {
      if (!getInteractionClass()
          .equals(other.getInteractionClass())) return false;
    }
    if (orderType_ != other.orderType_) return false;
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
    if (hasInteractionClass()) {
      hash = (37 * hash) + INTERACTIONCLASS_FIELD_NUMBER;
      hash = (53 * hash) + getInteractionClass().hashCode();
    }
    hash = (37 * hash) + ORDERTYPE_FIELD_NUMBER;
    hash = (53 * hash) + orderType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest)
      hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ChangeInteractionOrderTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ChangeInteractionOrderTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest.class, hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest.newBuilder()
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
        internalGetInteractionClassFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      interactionClass_ = null;
      if (interactionClassBuilder_ != null) {
        interactionClassBuilder_.dispose();
        interactionClassBuilder_ = null;
      }
      orderType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ChangeInteractionOrderTypeRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest build() {
      hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest buildPartial() {
      hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest result = new hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.interactionClass_ = interactionClassBuilder_ == null
            ? interactionClass_
            : interactionClassBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.orderType_ = orderType_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest other) {
      if (other == hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest.getDefaultInstance()) return this;
      if (other.hasInteractionClass()) {
        mergeInteractionClass(other.getInteractionClass());
      }
      if (other.orderType_ != 0) {
        setOrderTypeValue(other.getOrderTypeValue());
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
                  internalGetInteractionClassFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              orderType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private hla.rti1516_2024.fedpro.InteractionClassHandle interactionClass_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.InteractionClassHandle, hla.rti1516_2024.fedpro.InteractionClassHandle.Builder, hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder> interactionClassBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     * @return Whether the interactionClass field is set.
     */
    public boolean hasInteractionClass() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     * @return The interactionClass.
     */
    public hla.rti1516_2024.fedpro.InteractionClassHandle getInteractionClass() {
      if (interactionClassBuilder_ == null) {
        return interactionClass_ == null ? hla.rti1516_2024.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
      } else {
        return interactionClassBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder setInteractionClass(hla.rti1516_2024.fedpro.InteractionClassHandle value) {
      if (interactionClassBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        interactionClass_ = value;
      } else {
        interactionClassBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder setInteractionClass(
        hla.rti1516_2024.fedpro.InteractionClassHandle.Builder builderForValue) {
      if (interactionClassBuilder_ == null) {
        interactionClass_ = builderForValue.build();
      } else {
        interactionClassBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder mergeInteractionClass(hla.rti1516_2024.fedpro.InteractionClassHandle value) {
      if (interactionClassBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          interactionClass_ != null &&
          interactionClass_ != hla.rti1516_2024.fedpro.InteractionClassHandle.getDefaultInstance()) {
          getInteractionClassBuilder().mergeFrom(value);
        } else {
          interactionClass_ = value;
        }
      } else {
        interactionClassBuilder_.mergeFrom(value);
      }
      if (interactionClass_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder clearInteractionClass() {
      bitField0_ = (bitField0_ & ~0x00000001);
      interactionClass_ = null;
      if (interactionClassBuilder_ != null) {
        interactionClassBuilder_.dispose();
        interactionClassBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public hla.rti1516_2024.fedpro.InteractionClassHandle.Builder getInteractionClassBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetInteractionClassFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder getInteractionClassOrBuilder() {
      if (interactionClassBuilder_ != null) {
        return interactionClassBuilder_.getMessageOrBuilder();
      } else {
        return interactionClass_ == null ?
            hla.rti1516_2024.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.InteractionClassHandle, hla.rti1516_2024.fedpro.InteractionClassHandle.Builder, hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder> 
        internalGetInteractionClassFieldBuilder() {
      if (interactionClassBuilder_ == null) {
        interactionClassBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.InteractionClassHandle, hla.rti1516_2024.fedpro.InteractionClassHandle.Builder, hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder>(
                getInteractionClass(),
                getParentForChildren(),
                isClean());
        interactionClass_ = null;
      }
      return interactionClassBuilder_;
    }

    private int orderType_ = 0;
    /**
     * <code>.rti1516_2024.fedpro.OrderType orderType = 2;</code>
     * @return The enum numeric value on the wire for orderType.
     */
    @java.lang.Override public int getOrderTypeValue() {
      return orderType_;
    }
    /**
     * <code>.rti1516_2024.fedpro.OrderType orderType = 2;</code>
     * @param value The enum numeric value on the wire for orderType to set.
     * @return This builder for chaining.
     */
    public Builder setOrderTypeValue(int value) {
      orderType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.OrderType orderType = 2;</code>
     * @return The orderType.
     */
    @java.lang.Override
    public hla.rti1516_2024.fedpro.OrderType getOrderType() {
      hla.rti1516_2024.fedpro.OrderType result = hla.rti1516_2024.fedpro.OrderType.forNumber(orderType_);
      return result == null ? hla.rti1516_2024.fedpro.OrderType.UNRECOGNIZED : result;
    }
    /**
     * <code>.rti1516_2024.fedpro.OrderType orderType = 2;</code>
     * @param value The orderType to set.
     * @return This builder for chaining.
     */
    public Builder setOrderType(hla.rti1516_2024.fedpro.OrderType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      orderType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.OrderType orderType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      orderType_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest)
  private static final hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest();
  }

  public static hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeInteractionOrderTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChangeInteractionOrderTypeRequest>() {
    @java.lang.Override
    public ChangeInteractionOrderTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChangeInteractionOrderTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeInteractionOrderTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.ChangeInteractionOrderTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

