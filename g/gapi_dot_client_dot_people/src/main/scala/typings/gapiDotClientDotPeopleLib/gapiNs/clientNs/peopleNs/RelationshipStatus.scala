package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipStatus extends js.Object {
  /**
    * The read-only value of the relationship status translated and formatted in
    * the viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedValue: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the relationship status. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The relationship status. The value can be custom or predefined.
    * Possible values include, but are not limited to, the following:
    *
    * &#42; `single`
    * &#42; `inARelationship`
    * &#42; `engaged`
    * &#42; `married`
    * &#42; `itsComplicated`
    * &#42; `openRelationship`
    * &#42; `widowed`
    * &#42; `inDomesticPartnership`
    * &#42; `inCivilUnion`
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RelationshipStatus {
  @scala.inline
  def apply(
    formattedValue: java.lang.String = null,
    metadata: FieldMetadata = null,
    value: java.lang.String = null
  ): RelationshipStatus = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RelationshipStatus]
  }
}

