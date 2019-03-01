package typings
package opentracingLib.libTracerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpanOptions extends js.Object {
  /**
    * a parent SpanContext (or Span, for convenience) that the newly-started
    * span will be the child of (per REFERENCE_CHILD_OF). If specified,
    * `references` must be unspecified.
    */
  var childOf: js.UndefOr[
    opentracingLib.libSpanMod.default | opentracingLib.libSpanUnderscoreContextMod.default
  ] = js.undefined
  /**
    * an array of Reference instances, each pointing to a causal parent
    * SpanContext. If specified, `fields.childOf` must be unspecified.
    */
  var references: js.UndefOr[js.Array[opentracingLib.libReferenceMod.default]] = js.undefined
  /**
    * a manually specified start time for the created Span object. The time
    * should be specified in milliseconds as Unix timestamp. Decimal value are
    * supported to represent time values with sub-millisecond accuracy.
    */
  var startTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * set of key-value pairs which will be set as tags on the newly created
    * Span. Ownership of the object is passed to the created span for
    * efficiency reasons (the caller should not modify this object after
    * calling startSpan).
    */
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object SpanOptions {
  @scala.inline
  def apply(
    childOf: opentracingLib.libSpanMod.default | opentracingLib.libSpanUnderscoreContextMod.default = null,
    references: js.Array[opentracingLib.libReferenceMod.default] = null,
    startTime: scala.Int | scala.Double = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): SpanOptions = {
    val __obj = js.Dynamic.literal()
    if (childOf != null) __obj.updateDynamic("childOf")(childOf.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[SpanOptions]
  }
}

