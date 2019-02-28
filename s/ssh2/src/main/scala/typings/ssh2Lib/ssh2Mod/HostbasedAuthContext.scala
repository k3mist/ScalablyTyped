package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostbasedAuthContext
  extends AuthContextBase
     with AuthContext {
  /** The data used to verify the key, or `undefined` if the client is only checking the validity of the key. */
  var blob: nodeLib.Buffer = js.native
  /** The public key sent by the client. */
  var key: PublicKey = js.native
  /** The local hostname of the client. */
  var localHostname: java.lang.String = js.native
  /** The local username of the client. */
  var localUsername: java.lang.String = js.native
  /** The method of authentication. */
  @JSName("method")
  var method_HostbasedAuthContext: ssh2Lib.ssh2LibStrings.hostbased = js.native
  /** The signature algorithm, or `undefined` if the client is only checking the validity of the key. */
  var sigAlgo: java.lang.String = js.native
  /** The signature to verify, or `undefined` if the client is only checking the validity of the key. */
  var signature: js.UndefOr[nodeLib.Buffer] = js.native
}

