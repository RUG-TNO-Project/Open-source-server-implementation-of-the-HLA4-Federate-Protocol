// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FederateAmbassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange}
 */
public final class ConfirmInteractionTransportationTypeChange extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange)
    ConfirmInteractionTransportationTypeChangeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      ConfirmInteractionTransportationTypeChange.class.getName());
  }
  // Use ConfirmInteractionTransportationTypeChange.newBuilder() to construct.
  private ConfirmInteractionTransportationTypeChange(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ConfirmInteractionTransportationTypeChange() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_ConfirmInteractionTransportationTypeChange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_ConfirmInteractionTransportationTypeChange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange.class, hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange.Builder.class);
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

  public static final int TRANSPORTATIONTYPE_FIELD_NUMBER = 2;
  private hla.rti1516_2024.fedpro.TransportationTypeHandle transportationType_;
  /**
   * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
   * @return Whether the transportationType field is set.
   */
  @java.lang.Override
  public boolean hasTransportationType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
   * @return The transportationType.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.TransportationTypeHandle getTransportationType() {
    return transportationType_ == null ? hla.rti1516_2024.fedpro.TransportationTypeHandle.getDefaultInstance() : transportationType_;
  }
  /**
   * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
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
      output.writeMessage(1, getInteractionClass());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getTransportationType());
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
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTransportationType());
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange other = (hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange) obj;

    if (hasInteractionClass() != other.hasInteractionClass()) return false;
    if (hasInteractionClass()) {
      if (!getInteractionClass()
          .equals(other.getInteractionClass())) return false;
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
    if (hasInteractionClass()) {
      hash = (37 * hash) + INTERACTIONCLASS_FIELD_NUMBER;
      hash = (53 * hash) + getInteractionClass().hashCode();
    }
    if (hasTransportationType()) {
      hash = (37 * hash) + TRANSPORTATIONTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getTransportationType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange prototype) {
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
   * Protobuf type {@code rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange)
      hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_ConfirmInteractionTransportationTypeChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_ConfirmInteractionTransportationTypeChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange.class, hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange.newBuilder()
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
        internalGetTransportationTypeFieldBuilder();
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
      return hla.rti1516_2024.fedpro.FederateAmbassador.internal_static_rti1516_2024_fedpro_ConfirmInteractionTransportationTypeChange_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange build() {
      hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange buildPartial() {
      hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange result = new hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.interactionClass_ = interactionClassBuilder_ == null
            ? interactionClass_
            : interactionClassBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.transportationType_ = transportationTypeBuilder_ == null
            ? transportationType_
            : transportationTypeBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange) {
        return mergeFrom((hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange other) {
      if (other == hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange.getDefaultInstance()) return this;
      if (other.hasInteractionClass()) {
        mergeInteractionClass(other.getInteractionClass());
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
                  internalGetInteractionClassFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  internalGetTransportationTypeFieldBuilder().getBuilder(),
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

    private hla.rti1516_2024.fedpro.TransportationTypeHandle transportationType_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.TransportationTypeHandle, hla.rti1516_2024.fedpro.TransportationTypeHandle.Builder, hla.rti1516_2024.fedpro.TransportationTypeHandleOrBuilder> transportationTypeBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
     * @return Whether the transportationType field is set.
     */
    public boolean hasTransportationType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
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
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
     */
    public Builder setTransportationType(
        hla.rti1516_2024.fedpro.TransportationTypeHandle.Builder builderForValue) {
      if (transportationTypeBuilder_ == null) {
        transportationType_ = builderForValue.build();
      } else {
        transportationTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
     */
    public Builder mergeTransportationType(hla.rti1516_2024.fedpro.TransportationTypeHandle value) {
      if (transportationTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
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
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
     */
    public Builder clearTransportationType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      transportationType_ = null;
      if (transportationTypeBuilder_ != null) {
        transportationTypeBuilder_.dispose();
        transportationTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
     */
    public hla.rti1516_2024.fedpro.TransportationTypeHandle.Builder getTransportationTypeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return internalGetTransportationTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
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
     * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 2;</code>
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

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange)
  private static final hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange();
  }

  public static hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfirmInteractionTransportationTypeChange>
      PARSER = new com.google.protobuf.AbstractParser<ConfirmInteractionTransportationTypeChange>() {
    @java.lang.Override
    public ConfirmInteractionTransportationTypeChange parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConfirmInteractionTransportationTypeChange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfirmInteractionTransportationTypeChange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.ConfirmInteractionTransportationTypeChange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

