package typings
package adoneLib.adoneNs.mathNs.INs.DecimalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * The value that determines whether cryptographically-secure pseudo-random number generation is used.
    */
  var crypto: js.UndefOr[scala.Boolean] = js.undefined
  var defaults: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The positive exponent limit, i.e. the exponent value above which overflow to Infinity occurs.
    *
    * If the Decimal to be returned by a calculation would have an exponent higher than maxE then the value of that Decimal becomes Infinity.
    *
    * JavaScript numbers overflow to Infinity for exponents above 308.
    *
    * @default 9e15
    */
  var maxE: js.UndefOr[scala.Double] = js.undefined
  /**
    * The negative exponent limit, i.e. the exponent value below which underflow to zero occurs.
    *
    * If the Decimal to be returned by a calculation would have an exponent lower than minE then the value of that Decimal becomes zero.
    *
    * JavaScript numbers underflow to zero for exponents below -324.
    *
    * @default -9e15
    */
  var minE: js.UndefOr[scala.Double] = js.undefined
  /**
    * The modulo mode used when calculating the modulus: a mod n.
    *
    * The quotient, q = a / n, is calculated according to the rounding mode that corresponds to the chosen modulo mode.
    *
    * The remainder, r, is calculated as: r = a - n * q.
    *
    * @default 1 (ROUND_DOWN)
    */
  var modulo: js.UndefOr[Modulo] = js.undefined
  /**
    * The maximum number of significant digits of the result of an operation.
    *
    * @default 20
    */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default rounding mode used when rounding the result of an operation to precision significant digits, and when rounding
    * the return value of the round, toBinary, toDecimalPlaces, toExponential, toFixed, toHexadecimal, toNearest, toOctal,
    * toPrecision and toSignificantDigits methods.
    *
    * @default 4 (ROUND_HALF_UP)
    */
  var rounding: js.UndefOr[Rounding] = js.undefined
  /**
    * The negative exponent value at and below which toString returns exponential notation.
    *
    * JavaScript numbers use exponential notation for negative exponents of -7 and below.
    *
    * @default -7
    */
  var toExpNeg: js.UndefOr[scala.Double] = js.undefined
  /**
    * The positive exponent value at and above which toString returns exponential notation.
    *
    * JavaScript numbers use exponential notation for positive exponents of 20 and above.
    *
    * @default 20
    */
  var toExpPos: js.UndefOr[scala.Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    crypto: js.UndefOr[scala.Boolean] = js.undefined,
    defaults: js.UndefOr[scala.Boolean] = js.undefined,
    maxE: scala.Int | scala.Double = null,
    minE: scala.Int | scala.Double = null,
    modulo: Modulo = null,
    precision: scala.Int | scala.Double = null,
    rounding: Rounding = null,
    toExpNeg: scala.Int | scala.Double = null,
    toExpPos: scala.Int | scala.Double = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crypto)) __obj.updateDynamic("crypto")(crypto)
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults)
    if (maxE != null) __obj.updateDynamic("maxE")(maxE.asInstanceOf[js.Any])
    if (minE != null) __obj.updateDynamic("minE")(minE.asInstanceOf[js.Any])
    if (modulo != null) __obj.updateDynamic("modulo")(modulo)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (rounding != null) __obj.updateDynamic("rounding")(rounding)
    if (toExpNeg != null) __obj.updateDynamic("toExpNeg")(toExpNeg.asInstanceOf[js.Any])
    if (toExpPos != null) __obj.updateDynamic("toExpPos")(toExpPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

