package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "Trace")
@js.native
/**
  * Constructs a new Trace.
  * @param [properties] Properties to set
  */
class Trace ()
  extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace {
  def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Trace")
@js.native
object Trace extends js.Object {
  /**
    * Creates a new Trace instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Trace instance
    */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
    * Decodes a Trace message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
    * Decodes a Trace message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
    * Encodes the specified Trace message. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace): protobufjsLib.protobufjsMod.Writer = js.native
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Encodes the specified Trace message, length delimited. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace): protobufjsLib.protobufjsMod.Writer = js.native
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Creates a Trace message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Trace
    */
  def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace = js.native
  /**
    * Creates a plain object from a Trace message. Also converts values to other types if specified.
    * @param message Trace
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Trace,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Verifies a Trace message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

