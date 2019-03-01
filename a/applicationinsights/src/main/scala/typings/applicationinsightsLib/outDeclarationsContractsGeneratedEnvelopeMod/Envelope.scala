package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedEnvelopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System variables for a telemetry item.
  */
trait Envelope extends js.Object {
  /**
    * Telemetry data item.
    */
  var data: applicationinsightsLib.outDeclarationsContractsGeneratedBaseMod.namespaced
  /**
    * The application's instrumentation key. The key is typically represented as a GUID, but there are cases when it is not a guid. No code should rely on iKey being a GUID. Instrumentation key is case insensitive.
    */
  var iKey: java.lang.String
  /**
    * Type name of telemetry data item.
    */
  var name: java.lang.String
  /**
    * Sampling rate used in application. This telemetry item represents 1 / sampleRate actual telemetry items.
    */
  var sampleRate: scala.Double
  /**
    * Sequence field used to track absolute order of uploaded events.
    */
  var seq: java.lang.String
  /**
    * Key/value collection of context properties. See ContextTagKeys for information on available properties.
    */
  var tags: js.Any
  /**
    * Event date time when telemetry item was created. This is the wall clock time on the client when the event was generated. There is no guarantee that the client's time is accurate. This field must be formatted in UTC ISO 8601 format, with a trailing 'Z' character, as described publicly on https://en.wikipedia.org/wiki/ISO_8601#UTC. Note: the number of decimal seconds digits provided are variable (and unspecified). Consumers should handle this, i.e. managed code consumers should not use format 'O' for parsing as it specifies a fixed length. Example: 2009-06-15T13:45:30.0000000Z.
    */
  var time: java.lang.String
  /**
    * Envelope version. For internal use only. By assigning this the default, it will not be serialized within the payload unless changed to a value other than #1.
    */
  var ver: scala.Double
}

object Envelope {
  @scala.inline
  def apply(
    data: applicationinsightsLib.outDeclarationsContractsGeneratedBaseMod.namespaced,
    iKey: java.lang.String,
    name: java.lang.String,
    sampleRate: scala.Double,
    seq: java.lang.String,
    tags: js.Any,
    time: java.lang.String,
    ver: scala.Double
  ): Envelope = {
    val __obj = js.Dynamic.literal(data = data, iKey = iKey, name = name, sampleRate = sampleRate, seq = seq, tags = tags, time = time, ver = ver)
  
    __obj.asInstanceOf[Envelope]
  }
}

