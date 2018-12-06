package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "QueryLatencyStats")
@js.native
class QueryLatencyStats () extends IQueryLatencyStats {
  /**
       * Constructs a new QueryLatencyStats.
       * @param [properties] Properties to set
       */
  def this(properties: IQueryLatencyStats) = this()
  /** QueryLatencyStats cacheHits. */
  @JSName("cacheHits")
  var cacheHits_QueryLatencyStats: scala.Double = js.native
  /** QueryLatencyStats cacheLatencyCount. */
  @JSName("cacheLatencyCount")
  var cacheLatencyCount_QueryLatencyStats: js.Array[scala.Double] = js.native
  /** QueryLatencyStats latencyCount. */
  @JSName("latencyCount")
  var latencyCount_QueryLatencyStats: js.Array[scala.Double] = js.native
  /** QueryLatencyStats persistedQueryHits. */
  @JSName("persistedQueryHits")
  var persistedQueryHits_QueryLatencyStats: scala.Double = js.native
  /** QueryLatencyStats persistedQueryMisses. */
  @JSName("persistedQueryMisses")
  var persistedQueryMisses_QueryLatencyStats: scala.Double = js.native
  /** QueryLatencyStats privateCacheTtlCount. */
  @JSName("privateCacheTtlCount")
  var privateCacheTtlCount_QueryLatencyStats: js.Array[scala.Double] = js.native
  /** QueryLatencyStats publicCacheTtlCount. */
  @JSName("publicCacheTtlCount")
  var publicCacheTtlCount_QueryLatencyStats: js.Array[scala.Double] = js.native
  /** QueryLatencyStats requestCount. */
  @JSName("requestCount")
  var requestCount_QueryLatencyStats: scala.Double = js.native
  /** QueryLatencyStats requestsWithErrorsCount. */
  @JSName("requestsWithErrorsCount")
  var requestsWithErrorsCount_QueryLatencyStats: scala.Double = js.native
  /**
       * Converts this QueryLatencyStats to JSON.
       * @returns JSON object
       */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf", "QueryLatencyStats")
@js.native
object QueryLatencyStats extends js.Object {
  /**
       * Creates a new QueryLatencyStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns QueryLatencyStats instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats = js.native
  /**
       * Creates a new QueryLatencyStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns QueryLatencyStats instance
       */
  def create(
    properties: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IQueryLatencyStats
  ): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats = js.native
  /**
       * Decodes a QueryLatencyStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns QueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats = js.native
  /**
       * Decodes a QueryLatencyStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns QueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats = js.native
  /**
       * Decodes a QueryLatencyStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns QueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats = js.native
  /**
       * Decodes a QueryLatencyStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns QueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats = js.native
  /**
       * Decodes a QueryLatencyStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns QueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats = js.native
  /**
       * Decodes a QueryLatencyStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns QueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats = js.native
  /**
       * Encodes the specified QueryLatencyStats message. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
       * @param message QueryLatencyStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IQueryLatencyStats
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified QueryLatencyStats message. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
       * @param message QueryLatencyStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IQueryLatencyStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified QueryLatencyStats message, length delimited. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
       * @param message QueryLatencyStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IQueryLatencyStats
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified QueryLatencyStats message, length delimited. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
       * @param message QueryLatencyStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IQueryLatencyStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a QueryLatencyStats message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns QueryLatencyStats
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats = js.native
  /**
       * Creates a plain object from a QueryLatencyStats message. Also converts values to other types if specified.
       * @param message QueryLatencyStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a QueryLatencyStats message. Also converts values to other types if specified.
       * @param message QueryLatencyStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.QueryLatencyStats,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a QueryLatencyStats message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}
