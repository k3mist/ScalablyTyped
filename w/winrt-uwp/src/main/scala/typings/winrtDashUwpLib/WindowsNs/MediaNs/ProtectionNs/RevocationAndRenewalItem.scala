package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a component that is being revoked and renewed with a trusted component. */
@JSGlobal("Windows.Media.Protection.RevocationAndRenewalItem")
@js.native
abstract class RevocationAndRenewalItem () extends js.Object {
  /** Returns the header hash for the component being revoked. */
  var headerHash: java.lang.String = js.native
  /** Returns the name for the component being revoked. */
  var name: java.lang.String = js.native
  /** Returns the public key hash for the component. */
  var publicKeyHash: java.lang.String = js.native
  /** Returns the reason for revocation of component. */
  var reasons: RevocationAndRenewalReasons = js.native
  /** Returns the GUID for the renewal object. */
  var renewalId: java.lang.String = js.native
}

