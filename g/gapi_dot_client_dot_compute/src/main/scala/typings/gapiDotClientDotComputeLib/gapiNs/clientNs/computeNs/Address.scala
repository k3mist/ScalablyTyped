package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /** The static IP address represented by this resource. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** The type of address to reserve. If unspecified, defaults to EXTERNAL. */
  var addressType: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The IP Version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address. */
  var ipVersion: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#address for addresses. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] URL of the region where the regional address resides. This field is not applicable to global addresses. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An address that is RESERVING is currently in the process
    * of being reserved. A RESERVED address is currently reserved and available to use. An IN_USE address is currently being used by another resource and is
    * not available.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For external addresses, this field should not be used.
    *
    * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork's IP range.
    */
  var subnetwork: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The URLs of the resources that are using this address. */
  var users: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    addressType: java.lang.String = null,
    creationTimestamp: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    ipVersion: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    region: java.lang.String = null,
    selfLink: java.lang.String = null,
    status: java.lang.String = null,
    subnetwork: java.lang.String = null,
    users: js.Array[java.lang.String] = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (addressType != null) __obj.updateDynamic("addressType")(addressType)
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ipVersion != null) __obj.updateDynamic("ipVersion")(ipVersion)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (region != null) __obj.updateDynamic("region")(region)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[Address]
  }
}

