// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest}
 */
public final class UpdateAttributeValuesWithTimeRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest)
    UpdateAttributeValuesWithTimeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      UpdateAttributeValuesWithTimeRequest.class.getName());
  }
  // Use UpdateAttributeValuesWithTimeRequest.newBuilder() to construct.
  private UpdateAttributeValuesWithTimeRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateAttributeValuesWithTimeRequest() {
    userSuppliedTag_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_UpdateAttributeValuesWithTimeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_UpdateAttributeValuesWithTimeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest.class, hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int OBJECTINSTANCE_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance_;
  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   * @return Whether the objectInstance field is set.
   */
  @java.lang.Override
  public boolean hasObjectInstance() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   * @return The objectInstance.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.ObjectInstanceHandle getObjectInstance() {
    return objectInstance_ == null ? hla.rti1516_2024.fedpro.ObjectInstanceHandle.getDefaultInstance() : objectInstance_;
  }
  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.ObjectInstanceHandleOrBuilder getObjectInstanceOrBuilder() {
    return objectInstance_ == null ? hla.rti1516_2024.fedpro.ObjectInstanceHandle.getDefaultInstance() : objectInstance_;
  }

  public static final int ATTRIBUTEVALUES_FIELD_NUMBER = 2;
  private hla.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues_;
  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
   * @return Whether the attributeValues field is set.
   */
  @java.lang.Override
  public boolean hasAttributeValues() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
   * @return The attributeValues.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.AttributeHandleValueMap getAttributeValues() {
    return attributeValues_ == null ? hla.rti1516_2024.fedpro.AttributeHandleValueMap.getDefaultInstance() : attributeValues_;
  }
  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.AttributeHandleValueMapOrBuilder getAttributeValuesOrBuilder() {
    return attributeValues_ == null ? hla.rti1516_2024.fedpro.AttributeHandleValueMap.getDefaultInstance() : attributeValues_;
  }

  public static final int USERSUPPLIEDTAG_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString userSuppliedTag_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes userSuppliedTag = 3;</code>
   * @return The userSuppliedTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUserSuppliedTag() {
    return userSuppliedTag_;
  }

  public static final int TIME_FIELD_NUMBER = 4;
  private hla.rti1516_2024.fedpro.LogicalTime time_;
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
   * @return Whether the time field is set.
   */
  @java.lang.Override
  public boolean hasTime() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
   * @return The time.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.LogicalTime getTime() {
    return time_ == null ? hla.rti1516_2024.fedpro.LogicalTime.getDefaultInstance() : time_;
  }
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
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
      output.writeMessage(1, getObjectInstance());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getAttributeValues());
    }
    if (!userSuppliedTag_.isEmpty()) {
      output.writeBytes(3, userSuppliedTag_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(4, getTime());
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
        .computeMessageSize(1, getObjectInstance());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAttributeValues());
    }
    if (!userSuppliedTag_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, userSuppliedTag_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTime());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest other = (hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest) obj;

    if (hasObjectInstance() != other.hasObjectInstance()) return false;
    if (hasObjectInstance()) {
      if (!getObjectInstance()
          .equals(other.getObjectInstance())) return false;
    }
    if (hasAttributeValues() != other.hasAttributeValues()) return false;
    if (hasAttributeValues()) {
      if (!getAttributeValues()
          .equals(other.getAttributeValues())) return false;
    }
    if (!getUserSuppliedTag()
        .equals(other.getUserSuppliedTag())) return false;
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
    if (hasObjectInstance()) {
      hash = (37 * hash) + OBJECTINSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getObjectInstance().hashCode();
    }
    if (hasAttributeValues()) {
      hash = (37 * hash) + ATTRIBUTEVALUES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributeValues().hashCode();
    }
    hash = (37 * hash) + USERSUPPLIEDTAG_FIELD_NUMBER;
    hash = (53 * hash) + getUserSuppliedTag().hashCode();
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest)
      hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_UpdateAttributeValuesWithTimeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_UpdateAttributeValuesWithTimeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest.class, hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest.newBuilder()
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
        internalGetObjectInstanceFieldBuilder();
        internalGetAttributeValuesFieldBuilder();
        internalGetTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      objectInstance_ = null;
      if (objectInstanceBuilder_ != null) {
        objectInstanceBuilder_.dispose();
        objectInstanceBuilder_ = null;
      }
      attributeValues_ = null;
      if (attributeValuesBuilder_ != null) {
        attributeValuesBuilder_.dispose();
        attributeValuesBuilder_ = null;
      }
      userSuppliedTag_ = com.google.protobuf.ByteString.EMPTY;
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
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_UpdateAttributeValuesWithTimeRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest build() {
      hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest buildPartial() {
      hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest result = new hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectInstance_ = objectInstanceBuilder_ == null
            ? objectInstance_
            : objectInstanceBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attributeValues_ = attributeValuesBuilder_ == null
            ? attributeValues_
            : attributeValuesBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.userSuppliedTag_ = userSuppliedTag_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.time_ = timeBuilder_ == null
            ? time_
            : timeBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest other) {
      if (other == hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest.getDefaultInstance()) return this;
      if (other.hasObjectInstance()) {
        mergeObjectInstance(other.getObjectInstance());
      }
      if (other.hasAttributeValues()) {
        mergeAttributeValues(other.getAttributeValues());
      }
      if (!other.getUserSuppliedTag().isEmpty()) {
        setUserSuppliedTag(other.getUserSuppliedTag());
      }
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
                  internalGetObjectInstanceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  internalGetAttributeValuesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              userSuppliedTag_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  internalGetTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private hla.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.ObjectInstanceHandle, hla.rti1516_2024.fedpro.ObjectInstanceHandle.Builder, hla.rti1516_2024.fedpro.ObjectInstanceHandleOrBuilder> objectInstanceBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     * @return Whether the objectInstance field is set.
     */
    public boolean hasObjectInstance() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     * @return The objectInstance.
     */
    public hla.rti1516_2024.fedpro.ObjectInstanceHandle getObjectInstance() {
      if (objectInstanceBuilder_ == null) {
        return objectInstance_ == null ? hla.rti1516_2024.fedpro.ObjectInstanceHandle.getDefaultInstance() : objectInstance_;
      } else {
        return objectInstanceBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public Builder setObjectInstance(hla.rti1516_2024.fedpro.ObjectInstanceHandle value) {
      if (objectInstanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        objectInstance_ = value;
      } else {
        objectInstanceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public Builder setObjectInstance(
        hla.rti1516_2024.fedpro.ObjectInstanceHandle.Builder builderForValue) {
      if (objectInstanceBuilder_ == null) {
        objectInstance_ = builderForValue.build();
      } else {
        objectInstanceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public Builder mergeObjectInstance(hla.rti1516_2024.fedpro.ObjectInstanceHandle value) {
      if (objectInstanceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          objectInstance_ != null &&
          objectInstance_ != hla.rti1516_2024.fedpro.ObjectInstanceHandle.getDefaultInstance()) {
          getObjectInstanceBuilder().mergeFrom(value);
        } else {
          objectInstance_ = value;
        }
      } else {
        objectInstanceBuilder_.mergeFrom(value);
      }
      if (objectInstance_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public Builder clearObjectInstance() {
      bitField0_ = (bitField0_ & ~0x00000001);
      objectInstance_ = null;
      if (objectInstanceBuilder_ != null) {
        objectInstanceBuilder_.dispose();
        objectInstanceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public hla.rti1516_2024.fedpro.ObjectInstanceHandle.Builder getObjectInstanceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetObjectInstanceFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    public hla.rti1516_2024.fedpro.ObjectInstanceHandleOrBuilder getObjectInstanceOrBuilder() {
      if (objectInstanceBuilder_ != null) {
        return objectInstanceBuilder_.getMessageOrBuilder();
      } else {
        return objectInstance_ == null ?
            hla.rti1516_2024.fedpro.ObjectInstanceHandle.getDefaultInstance() : objectInstance_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.ObjectInstanceHandle, hla.rti1516_2024.fedpro.ObjectInstanceHandle.Builder, hla.rti1516_2024.fedpro.ObjectInstanceHandleOrBuilder> 
        internalGetObjectInstanceFieldBuilder() {
      if (objectInstanceBuilder_ == null) {
        objectInstanceBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.ObjectInstanceHandle, hla.rti1516_2024.fedpro.ObjectInstanceHandle.Builder, hla.rti1516_2024.fedpro.ObjectInstanceHandleOrBuilder>(
                getObjectInstance(),
                getParentForChildren(),
                isClean());
        objectInstance_ = null;
      }
      return objectInstanceBuilder_;
    }

    private hla.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.AttributeHandleValueMap, hla.rti1516_2024.fedpro.AttributeHandleValueMap.Builder, hla.rti1516_2024.fedpro.AttributeHandleValueMapOrBuilder> attributeValuesBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
     * @return Whether the attributeValues field is set.
     */
    public boolean hasAttributeValues() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
     * @return The attributeValues.
     */
    public hla.rti1516_2024.fedpro.AttributeHandleValueMap getAttributeValues() {
      if (attributeValuesBuilder_ == null) {
        return attributeValues_ == null ? hla.rti1516_2024.fedpro.AttributeHandleValueMap.getDefaultInstance() : attributeValues_;
      } else {
        return attributeValuesBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
     */
    public Builder setAttributeValues(hla.rti1516_2024.fedpro.AttributeHandleValueMap value) {
      if (attributeValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attributeValues_ = value;
      } else {
        attributeValuesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
     */
    public Builder setAttributeValues(
        hla.rti1516_2024.fedpro.AttributeHandleValueMap.Builder builderForValue) {
      if (attributeValuesBuilder_ == null) {
        attributeValues_ = builderForValue.build();
      } else {
        attributeValuesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
     */
    public Builder mergeAttributeValues(hla.rti1516_2024.fedpro.AttributeHandleValueMap value) {
      if (attributeValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          attributeValues_ != null &&
          attributeValues_ != hla.rti1516_2024.fedpro.AttributeHandleValueMap.getDefaultInstance()) {
          getAttributeValuesBuilder().mergeFrom(value);
        } else {
          attributeValues_ = value;
        }
      } else {
        attributeValuesBuilder_.mergeFrom(value);
      }
      if (attributeValues_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
     */
    public Builder clearAttributeValues() {
      bitField0_ = (bitField0_ & ~0x00000002);
      attributeValues_ = null;
      if (attributeValuesBuilder_ != null) {
        attributeValuesBuilder_.dispose();
        attributeValuesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
     */
    public hla.rti1516_2024.fedpro.AttributeHandleValueMap.Builder getAttributeValuesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return internalGetAttributeValuesFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
     */
    public hla.rti1516_2024.fedpro.AttributeHandleValueMapOrBuilder getAttributeValuesOrBuilder() {
      if (attributeValuesBuilder_ != null) {
        return attributeValuesBuilder_.getMessageOrBuilder();
      } else {
        return attributeValues_ == null ?
            hla.rti1516_2024.fedpro.AttributeHandleValueMap.getDefaultInstance() : attributeValues_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.AttributeHandleValueMap, hla.rti1516_2024.fedpro.AttributeHandleValueMap.Builder, hla.rti1516_2024.fedpro.AttributeHandleValueMapOrBuilder> 
        internalGetAttributeValuesFieldBuilder() {
      if (attributeValuesBuilder_ == null) {
        attributeValuesBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.AttributeHandleValueMap, hla.rti1516_2024.fedpro.AttributeHandleValueMap.Builder, hla.rti1516_2024.fedpro.AttributeHandleValueMapOrBuilder>(
                getAttributeValues(),
                getParentForChildren(),
                isClean());
        attributeValues_ = null;
      }
      return attributeValuesBuilder_;
    }

    private com.google.protobuf.ByteString userSuppliedTag_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes userSuppliedTag = 3;</code>
     * @return The userSuppliedTag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getUserSuppliedTag() {
      return userSuppliedTag_;
    }
    /**
     * <code>bytes userSuppliedTag = 3;</code>
     * @param value The userSuppliedTag to set.
     * @return This builder for chaining.
     */
    public Builder setUserSuppliedTag(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      userSuppliedTag_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes userSuppliedTag = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserSuppliedTag() {
      bitField0_ = (bitField0_ & ~0x00000004);
      userSuppliedTag_ = getDefaultInstance().getUserSuppliedTag();
      onChanged();
      return this;
    }

    private hla.rti1516_2024.fedpro.LogicalTime time_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.LogicalTime, hla.rti1516_2024.fedpro.LogicalTime.Builder, hla.rti1516_2024.fedpro.LogicalTimeOrBuilder> timeBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
     * @return Whether the time field is set.
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
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
     * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
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
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
     */
    public Builder setTime(
        hla.rti1516_2024.fedpro.LogicalTime.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
     */
    public Builder mergeTime(hla.rti1516_2024.fedpro.LogicalTime value) {
      if (timeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
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
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
     */
    public Builder clearTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
     */
    public hla.rti1516_2024.fedpro.LogicalTime.Builder getTimeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return internalGetTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
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
     * <code>.rti1516_2024.fedpro.LogicalTime time = 4;</code>
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

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest)
  private static final hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest();
  }

  public static hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAttributeValuesWithTimeRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAttributeValuesWithTimeRequest>() {
    @java.lang.Override
    public UpdateAttributeValuesWithTimeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAttributeValuesWithTimeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAttributeValuesWithTimeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.UpdateAttributeValuesWithTimeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

