// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface SubscribeInteractionClassWithRegionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.SubscribeInteractionClassWithRegionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return Whether the interactionClass field is set.
   */
  boolean hasInteractionClass();
  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return The interactionClass.
   */
  hla.rti1516_2024.fedpro.InteractionClassHandle getInteractionClass();
  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   */
  hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder getInteractionClassOrBuilder();

  /**
   * <code>bool active = 2;</code>
   * @return The active.
   */
  boolean getActive();

  /**
   * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 3;</code>
   * @return Whether the regions field is set.
   */
  boolean hasRegions();
  /**
   * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 3;</code>
   * @return The regions.
   */
  hla.rti1516_2024.fedpro.RegionHandleSet getRegions();
  /**
   * <code>.rti1516_2024.fedpro.RegionHandleSet regions = 3;</code>
   */
  hla.rti1516_2024.fedpro.RegionHandleSetOrBuilder getRegionsOrBuilder();
}
