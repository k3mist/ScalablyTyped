package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderShipment extends js.Object {
  /**
    * The carrier handling the shipment.
    *
    * Acceptable values are:
    * - "gsx"
    * - "ups"
    * - "united parcel service"
    * - "usps"
    * - "united states postal service"
    * - "fedex"
    * - "dhl"
    * - "ecourier"
    * - "cxt"
    * - "google"
    * - "on trac"
    * - "ontrac"
    * - "on-trac"
    * - "on_trac"
    * - "delvic"
    * - "dynamex"
    * - "lasership"
    * - "smartpost"
    * - "fedex smartpost"
    * - "mpx"
    * - "uds"
    * - "united delivery service"
    */
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /** Date on which the shipment has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[java.lang.String] = js.undefined
  /** Date on which the shipment has been delivered, in ISO 8601 format. Present only if status is delievered */
  var deliveryDate: js.UndefOr[java.lang.String] = js.undefined
  /** The id of the shipment. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The line items that are shipped. */
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.undefined
  /** The status of the shipment. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The tracking id for the shipment. */
  var trackingId: js.UndefOr[java.lang.String] = js.undefined
}

object OrderShipment {
  @scala.inline
  def apply(
    carrier: java.lang.String = null,
    creationDate: java.lang.String = null,
    deliveryDate: java.lang.String = null,
    id: java.lang.String = null,
    lineItems: js.Array[OrderShipmentLineItemShipment] = null,
    status: java.lang.String = null,
    trackingId: java.lang.String = null
  ): OrderShipment = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (deliveryDate != null) __obj.updateDynamic("deliveryDate")(deliveryDate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    if (status != null) __obj.updateDynamic("status")(status)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[OrderShipment]
  }
}

