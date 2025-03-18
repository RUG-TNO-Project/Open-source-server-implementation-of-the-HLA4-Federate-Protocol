// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest}
 */
public final class RequestClassAttributeValueUpdateRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest)
    RequestClassAttributeValueUpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      RequestClassAttributeValueUpdateRequest.class.getName());
  }
  // Use RequestClassAttributeValueUpdateRequest.newBuilder() to construct.
  private RequestClassAttributeValueUpdateRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RequestClassAttributeValueUpdateRequest() {
    userSuppliedTag_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_RequestClassAttributeValueUpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_RequestClassAttributeValueUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest.class, hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest.Builder.class);
  }

  private int bitField0_;
  public static final int OBJECTCLASS_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.ObjectClassHandle objectClass_;
  /**
   * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
   * @return Whether the objectClass field is set.
   */
  @java.lang.Override
  public boolean hasObjectClass() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
   * @return The objectClass.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.ObjectClassHandle getObjectClass() {
    return objectClass_ == null ? hla.rti1516_2024.fedpro.ObjectClassHandle.getDefaultInstance() : objectClass_;
  }
  /**
   * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.ObjectClassHandleOrBuilder getObjectClassOrBuilder() {
    return objectClass_ == null ? hla.rti1516_2024.fedpro.ObjectClassHandle.getDefaultInstance() : objectClass_;
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 2;
  private hla.rti1516_2024.fedpro.AttributeHandleSet attributes_;
  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
   * @return Whether the attributes field is set.
   */
  @java.lang.Override
  public boolean hasAttributes() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
   * @return The attributes.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.AttributeHandleSet getAttributes() {
    return attributes_ == null ? hla.rti1516_2024.fedpro.AttributeHandleSet.getDefaultInstance() : attributes_;
  }
  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.AttributeHandleSetOrBuilder getAttributesOrBuilder() {
    return attributes_ == null ? hla.rti1516_2024.fedpro.AttributeHandleSet.getDefaultInstance() : attributes_;
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
      output.writeMessage(1, getObjectClass());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getAttributes());
    }
    if (!userSuppliedTag_.isEmpty()) {
      output.writeBytes(3, userSuppliedTag_);
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
        .computeMessageSize(1, getObjectClass());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAttributes());
    }
    if (!userSuppliedTag_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, userSuppliedTag_);
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest other = (hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest) obj;

    if (hasObjectClass() != other.hasObjectClass()) return false;
    if (hasObjectClass()) {
      if (!getObjectClass()
          .equals(other.getObjectClass())) return false;
    }
    if (hasAttributes() != other.hasAttributes()) return false;
    if (hasAttributes()) {
      if (!getAttributes()
          .equals(other.getAttributes())) return false;
    }
    if (!getUserSuppliedTag()
        .equals(other.getUserSuppliedTag())) return false;
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
    if (hasObjectClass()) {
      hash = (37 * hash) + OBJECTCLASS_FIELD_NUMBER;
      hash = (53 * hash) + getObjectClass().hashCode();
    }
    if (hasAttributes()) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributes().hashCode();
    }
    hash = (37 * hash) + USERSUPPLIEDTAG_FIELD_NUMBER;
    hash = (53 * hash) + getUserSuppliedTag().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest)
      hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_RequestClassAttributeValueUpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_RequestClassAttributeValueUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest.class, hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest.newBuilder()
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
        internalGetObjectClassFieldBuilder();
        internalGetAttributesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      objectClass_ = null;
      if (objectClassBuilder_ != null) {
        objectClassBuilder_.dispose();
        objectClassBuilder_ = null;
      }
      attributes_ = null;
      if (attributesBuilder_ != null) {
        attributesBuilder_.dispose();
        attributesBuilder_ = null;
      }
      userSuppliedTag_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_RequestClassAttributeValueUpdateRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest build() {
      hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest buildPartial() {
      hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest result = new hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectClass_ = objectClassBuilder_ == null
            ? objectClass_
            : objectClassBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attributes_ = attributesBuilder_ == null
            ? attributes_
            : attributesBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.userSuppliedTag_ = userSuppliedTag_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest other) {
      if (other == hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest.getDefaultInstance()) return this;
      if (other.hasObjectClass()) {
        mergeObjectClass(other.getObjectClass());
      }
      if (other.hasAttributes()) {
        mergeAttributes(other.getAttributes());
      }
      if (!other.getUserSuppliedTag().isEmpty()) {
        setUserSuppliedTag(other.getUserSuppliedTag());
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
                  internalGetObjectClassFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  internalGetAttributesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              userSuppliedTag_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private hla.rti1516_2024.fedpro.ObjectClassHandle objectClass_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.ObjectClassHandle, hla.rti1516_2024.fedpro.ObjectClassHandle.Builder, hla.rti1516_2024.fedpro.ObjectClassHandleOrBuilder> objectClassBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
     * @return Whether the objectClass field is set.
     */
    public boolean hasObjectClass() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
     * @return The objectClass.
     */
    public hla.rti1516_2024.fedpro.ObjectClassHandle getObjectClass() {
      if (objectClassBuilder_ == null) {
        return objectClass_ == null ? hla.rti1516_2024.fedpro.ObjectClassHandle.getDefaultInstance() : objectClass_;
      } else {
        return objectClassBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public Builder setObjectClass(hla.rti1516_2024.fedpro.ObjectClassHandle value) {
      if (objectClassBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        objectClass_ = value;
      } else {
        objectClassBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public Builder setObjectClass(
        hla.rti1516_2024.fedpro.ObjectClassHandle.Builder builderForValue) {
      if (objectClassBuilder_ == null) {
        objectClass_ = builderForValue.build();
      } else {
        objectClassBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public Builder mergeObjectClass(hla.rti1516_2024.fedpro.ObjectClassHandle value) {
      if (objectClassBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          objectClass_ != null &&
          objectClass_ != hla.rti1516_2024.fedpro.ObjectClassHandle.getDefaultInstance()) {
          getObjectClassBuilder().mergeFrom(value);
        } else {
          objectClass_ = value;
        }
      } else {
        objectClassBuilder_.mergeFrom(value);
      }
      if (objectClass_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public Builder clearObjectClass() {
      bitField0_ = (bitField0_ & ~0x00000001);
      objectClass_ = null;
      if (objectClassBuilder_ != null) {
        objectClassBuilder_.dispose();
        objectClassBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public hla.rti1516_2024.fedpro.ObjectClassHandle.Builder getObjectClassBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetObjectClassFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    public hla.rti1516_2024.fedpro.ObjectClassHandleOrBuilder getObjectClassOrBuilder() {
      if (objectClassBuilder_ != null) {
        return objectClassBuilder_.getMessageOrBuilder();
      } else {
        return objectClass_ == null ?
            hla.rti1516_2024.fedpro.ObjectClassHandle.getDefaultInstance() : objectClass_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.ObjectClassHandle, hla.rti1516_2024.fedpro.ObjectClassHandle.Builder, hla.rti1516_2024.fedpro.ObjectClassHandleOrBuilder> 
        internalGetObjectClassFieldBuilder() {
      if (objectClassBuilder_ == null) {
        objectClassBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.ObjectClassHandle, hla.rti1516_2024.fedpro.ObjectClassHandle.Builder, hla.rti1516_2024.fedpro.ObjectClassHandleOrBuilder>(
                getObjectClass(),
                getParentForChildren(),
                isClean());
        objectClass_ = null;
      }
      return objectClassBuilder_;
    }

    private hla.rti1516_2024.fedpro.AttributeHandleSet attributes_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.AttributeHandleSet, hla.rti1516_2024.fedpro.AttributeHandleSet.Builder, hla.rti1516_2024.fedpro.AttributeHandleSetOrBuilder> attributesBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
     * @return Whether the attributes field is set.
     */
    public boolean hasAttributes() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
     * @return The attributes.
     */
    public hla.rti1516_2024.fedpro.AttributeHandleSet getAttributes() {
      if (attributesBuilder_ == null) {
        return attributes_ == null ? hla.rti1516_2024.fedpro.AttributeHandleSet.getDefaultInstance() : attributes_;
      } else {
        return attributesBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public Builder setAttributes(hla.rti1516_2024.fedpro.AttributeHandleSet value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attributes_ = value;
      } else {
        attributesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public Builder setAttributes(
        hla.rti1516_2024.fedpro.AttributeHandleSet.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        attributes_ = builderForValue.build();
      } else {
        attributesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public Builder mergeAttributes(hla.rti1516_2024.fedpro.AttributeHandleSet value) {
      if (attributesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          attributes_ != null &&
          attributes_ != hla.rti1516_2024.fedpro.AttributeHandleSet.getDefaultInstance()) {
          getAttributesBuilder().mergeFrom(value);
        } else {
          attributes_ = value;
        }
      } else {
        attributesBuilder_.mergeFrom(value);
      }
      if (attributes_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public Builder clearAttributes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      attributes_ = null;
      if (attributesBuilder_ != null) {
        attributesBuilder_.dispose();
        attributesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public hla.rti1516_2024.fedpro.AttributeHandleSet.Builder getAttributesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return internalGetAttributesFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    public hla.rti1516_2024.fedpro.AttributeHandleSetOrBuilder getAttributesOrBuilder() {
      if (attributesBuilder_ != null) {
        return attributesBuilder_.getMessageOrBuilder();
      } else {
        return attributes_ == null ?
            hla.rti1516_2024.fedpro.AttributeHandleSet.getDefaultInstance() : attributes_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.AttributeHandleSet attributes = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.AttributeHandleSet, hla.rti1516_2024.fedpro.AttributeHandleSet.Builder, hla.rti1516_2024.fedpro.AttributeHandleSetOrBuilder> 
        internalGetAttributesFieldBuilder() {
      if (attributesBuilder_ == null) {
        attributesBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.AttributeHandleSet, hla.rti1516_2024.fedpro.AttributeHandleSet.Builder, hla.rti1516_2024.fedpro.AttributeHandleSetOrBuilder>(
                getAttributes(),
                getParentForChildren(),
                isClean());
        attributes_ = null;
      }
      return attributesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest)
  private static final hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest();
  }

  public static hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestClassAttributeValueUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<RequestClassAttributeValueUpdateRequest>() {
    @java.lang.Override
    public RequestClassAttributeValueUpdateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RequestClassAttributeValueUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestClassAttributeValueUpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.RequestClassAttributeValueUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

