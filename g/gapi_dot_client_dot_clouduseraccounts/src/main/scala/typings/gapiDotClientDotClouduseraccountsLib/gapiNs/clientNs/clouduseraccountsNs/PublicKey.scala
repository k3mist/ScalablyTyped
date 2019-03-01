package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional textual description of the resource; provided by the client when the resource is created. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Optional expiration timestamp. If provided, the timestamp must be in RFC3339 text format. If not provided, the public key never expires. */
  var expirationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The fingerprint of the key is defined by RFC4716 to be the MD5 digest of the public key. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Public key text in SSH format, defined by RFC4253 section 6.6. */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object PublicKey {
  @scala.inline
  def apply(
    creationTimestamp: java.lang.String = null,
    description: java.lang.String = null,
    expirationTimestamp: java.lang.String = null,
    fingerprint: java.lang.String = null,
    key: java.lang.String = null
  ): PublicKey = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (expirationTimestamp != null) __obj.updateDynamic("expirationTimestamp")(expirationTimestamp)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[PublicKey]
  }
}

