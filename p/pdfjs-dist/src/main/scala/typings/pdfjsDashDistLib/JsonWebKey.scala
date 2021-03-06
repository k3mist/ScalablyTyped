package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonWebKey extends js.Object {
  var alg: js.UndefOr[java.lang.String] = js.undefined
  var crv: js.UndefOr[java.lang.String] = js.undefined
  var d: js.UndefOr[java.lang.String] = js.undefined
  var dp: js.UndefOr[java.lang.String] = js.undefined
  var dq: js.UndefOr[java.lang.String] = js.undefined
  var e: js.UndefOr[java.lang.String] = js.undefined
  var ext: js.UndefOr[scala.Boolean] = js.undefined
  var k: js.UndefOr[java.lang.String] = js.undefined
  var key_ops: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var kty: js.UndefOr[java.lang.String] = js.undefined
  var n: js.UndefOr[java.lang.String] = js.undefined
  var oth: js.UndefOr[js.Array[RsaOtherPrimesInfo]] = js.undefined
  var p: js.UndefOr[java.lang.String] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var qi: js.UndefOr[java.lang.String] = js.undefined
  var use: js.UndefOr[java.lang.String] = js.undefined
  var x: js.UndefOr[java.lang.String] = js.undefined
  var y: js.UndefOr[java.lang.String] = js.undefined
}

object JsonWebKey {
  @scala.inline
  def apply(
    alg: java.lang.String = null,
    crv: java.lang.String = null,
    d: java.lang.String = null,
    dp: java.lang.String = null,
    dq: java.lang.String = null,
    e: java.lang.String = null,
    ext: js.UndefOr[scala.Boolean] = js.undefined,
    k: java.lang.String = null,
    key_ops: js.Array[java.lang.String] = null,
    kty: java.lang.String = null,
    n: java.lang.String = null,
    oth: js.Array[RsaOtherPrimesInfo] = null,
    p: java.lang.String = null,
    q: java.lang.String = null,
    qi: java.lang.String = null,
    use: java.lang.String = null,
    x: java.lang.String = null,
    y: java.lang.String = null
  ): JsonWebKey = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (crv != null) __obj.updateDynamic("crv")(crv)
    if (d != null) __obj.updateDynamic("d")(d)
    if (dp != null) __obj.updateDynamic("dp")(dp)
    if (dq != null) __obj.updateDynamic("dq")(dq)
    if (e != null) __obj.updateDynamic("e")(e)
    if (!js.isUndefined(ext)) __obj.updateDynamic("ext")(ext)
    if (k != null) __obj.updateDynamic("k")(k)
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops)
    if (kty != null) __obj.updateDynamic("kty")(kty)
    if (n != null) __obj.updateDynamic("n")(n)
    if (oth != null) __obj.updateDynamic("oth")(oth)
    if (p != null) __obj.updateDynamic("p")(p)
    if (q != null) __obj.updateDynamic("q")(q)
    if (qi != null) __obj.updateDynamic("qi")(qi)
    if (use != null) __obj.updateDynamic("use")(use)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[JsonWebKey]
  }
}

