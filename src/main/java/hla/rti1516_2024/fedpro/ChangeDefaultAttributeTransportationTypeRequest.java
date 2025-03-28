// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest}
 */
public final class ChangeDefaultAttributeTransportationTypeRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest)
    ChangeDefaultAttributeTransportationTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      ChangeDefaultAttributeTransportationTypeRequest.class.getName());
  }
  // Use ChangeDefaultAttributeTransportationTypeRequest.newBuilder() to construct.
  private ChangeDefaultAttributeTransportationTypeRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ChangeDefaultAttributeTransportationTypeRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ChangeDefaultAttributeTransportationTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ChangeDefaultAttributeTransportationTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest.class, hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest.Builder.class);
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

  public static final int TRANSPORTATIONTYPE_FIELD_NUMBER = 3;
  private hla.rti1516_2024.fedpro.TransportationTypeHandle transportationType_;
  /**
   * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
   * @return Whether the transportationType field is set.
   */
  @java.lang.Override
  public boolean hasTransportationType() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
   * @return The transportationType.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.TransportationTypeHandle getTransportationType() {
    return transportationType_ == null ? hla.rti1516_2024.fedpro.TransportationTypeHandle.getDefaultInstance() : transportationType_;
  }
  /**
   * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.TransportationTypeHandleOrBuilder getTransportationTypeOrBuilder() {
    return transportationType_ == null ? hla.rti1516_2024.fedpro.TransportationTypeHandle.getDefaultInstance() : transportationType_;
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
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getTransportationType());
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
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTransportationType());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest other = (hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest) obj;

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
    if (hasTransportationType() != other.hasTransportationType()) return false;
    if (hasTransportationType()) {
      if (!getTransportationType()
          .equals(other.getTransportationType())) return false;
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
    if (hasObjectClass()) {
      hash = (37 * hash) + OBJECTCLASS_FIELD_NUMBER;
      hash = (53 * hash) + getObjectClass().hashCode();
    }
    if (hasAttributes()) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributes().hashCode();
    }
    if (hasTransportationType()) {
      hash = (37 * hash) + TRANSPORTATIONTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getTransportationType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest)
      hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ChangeDefaultAttributeTransportationTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ChangeDefaultAttributeTransportationTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest.class, hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest.newBuilder()
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
        internalGetTransportationTypeFieldBuilder();
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
      transportationType_ = null;
      if (transportationTypeBuilder_ != null) {
        transportationTypeBuilder_.dispose();
        transportationTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_ChangeDefaultAttributeTransportationTypeRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest build() {
      hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest buildPartial() {
      hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest result = new hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest result) {
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
        result.transportationType_ = transportationTypeBuilder_ == null
            ? transportationType_
            : transportationTypeBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest other) {
      if (other == hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest.getDefaultInstance()) return this;
      if (other.hasObjectClass()) {
        mergeObjectClass(other.getObjectClass());
      }
      if (other.hasAttributes()) {
        mergeAttributes(other.getAttributes());
      }
      if (other.hasTransportationType()) {
        mergeTransportationType(other.getTransportationType());
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
              input.readMessage(
                  internalGetTransportationTypeFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private hla.rti1516_2024.fedpro.TransportationTypeHandle transportationType_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.TransportationTypeHandle, hla.rti1516_2024.fedpro.TransportationTypeHandle.Builder, hla.rti1516_2024.fedpro.TransportationTypeHandleOrBuilder> transportationTypeBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
     * @return Whether the transportationType field is set.
     */
    public boolean hasTransportationType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
     * @return The transportationType.
     */
    public hla.rti1516_2024.fedpro.TransportationTypeHandle getTransportationType() {
      if (transportationTypeBuilder_ == null) {
        return transportationType_ == null ? hla.rti1516_2024.fedpro.TransportationTypeHandle.getDefaultInstance() : transportationType_;
      } else {
        return transportationTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
     */
    public Builder setTransportationType(hla.rti1516_2024.fedpro.TransportationTypeHandle value) {
      if (transportationTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transportationType_ = value;
      } else {
        transportationTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
     */
    public Builder setTransportationType(
        hla.rti1516_2024.fedpro.TransportationTypeHandle.Builder builderForValue) {
      if (transportationTypeBuilder_ == null) {
        transportationType_ = builderForValue.build();
      } else {
        transportationTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
     */
    public Builder mergeTransportationType(hla.rti1516_2024.fedpro.TransportationTypeHandle value) {
      if (transportationTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          transportationType_ != null &&
          transportationType_ != hla.rti1516_2024.fedpro.TransportationTypeHandle.getDefaultInstance()) {
          getTransportationTypeBuilder().mergeFrom(value);
        } else {
          transportationType_ = value;
        }
      } else {
        transportationTypeBuilder_.mergeFrom(value);
      }
      if (transportationType_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
     */
    public Builder clearTransportationType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      transportationType_ = null;
      if (transportationTypeBuilder_ != null) {
        transportationTypeBuilder_.dispose();
        transportationTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
     */
    public hla.rti1516_2024.fedpro.TransportationTypeHandle.Builder getTransportationTypeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return internalGetTransportationTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
     */
    public hla.rti1516_2024.fedpro.TransportationTypeHandleOrBuilder getTransportationTypeOrBuilder() {
      if (transportationTypeBuilder_ != null) {
        return transportationTypeBuilder_.getMessageOrBuilder();
      } else {
        return transportationType_ == null ?
            hla.rti1516_2024.fedpro.TransportationTypeHandle.getDefaultInstance() : transportationType_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.TransportationTypeHandle, hla.rti1516_2024.fedpro.TransportationTypeHandle.Builder, hla.rti1516_2024.fedpro.TransportationTypeHandleOrBuilder> 
        internalGetTransportationTypeFieldBuilder() {
      if (transportationTypeBuilder_ == null) {
        transportationTypeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.TransportationTypeHandle, hla.rti1516_2024.fedpro.TransportationTypeHandle.Builder, hla.rti1516_2024.fedpro.TransportationTypeHandleOrBuilder>(
                getTransportationType(),
                getParentForChildren(),
                isClean());
        transportationType_ = null;
      }
      return transportationTypeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest)
  private static final hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest();
  }

  public static hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeDefaultAttributeTransportationTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChangeDefaultAttributeTransportationTypeRequest>() {
    @java.lang.Override
    public ChangeDefaultAttributeTransportationTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChangeDefaultAttributeTransportationTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeDefaultAttributeTransportationTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.ChangeDefaultAttributeTransportationTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

