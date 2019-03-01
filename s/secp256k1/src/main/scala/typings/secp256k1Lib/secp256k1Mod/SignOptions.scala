package typings
package secp256k1Lib.secp256k1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  /**
    * Additional data for noncefn (RFC 6979 3.6) (32 bytes).
    *
    * By default is `null`.
    */
  var data: js.UndefOr[nodeLib.Buffer] = js.undefined
  /** Nonce generator. By default it is rfc6979 */
  var noncefn: js.UndefOr[
    js.Function5[
      /* message */ nodeLib.Buffer, 
      /* privateKey */ nodeLib.Buffer, 
      /* algo */ nodeLib.Buffer | scala.Null, 
      /* data */ nodeLib.Buffer | scala.Null, 
      /* attempt */ scala.Double, 
      nodeLib.Buffer
    ]
  ] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    data: nodeLib.Buffer = null,
    noncefn: js.Function5[
      /* message */ nodeLib.Buffer, 
      /* privateKey */ nodeLib.Buffer, 
      /* algo */ nodeLib.Buffer | scala.Null, 
      /* data */ nodeLib.Buffer | scala.Null, 
      /* attempt */ scala.Double, 
      nodeLib.Buffer
    ] = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (noncefn != null) __obj.updateDynamic("noncefn")(noncefn)
    __obj.asInstanceOf[SignOptions]
  }
}

