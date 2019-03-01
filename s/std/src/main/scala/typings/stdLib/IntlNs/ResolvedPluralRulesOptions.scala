package typings
package stdLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedPluralRulesOptions extends js.Object {
  var locale: java.lang.String
  var maximumFractionDigits: scala.Double
  var maximumSignificantDigits: scala.Double
  var minimumFractionDigits: scala.Double
  var minimumIntegerDigits: scala.Double
  var minimumSignificantDigits: scala.Double
  var pluralCategories: js.Array[java.lang.String]
  var `type`: stdLib.stdLibStrings.cardinal | stdLib.stdLibStrings.ordinal
}

object ResolvedPluralRulesOptions {
  @scala.inline
  def apply(
    locale: java.lang.String,
    maximumFractionDigits: scala.Double,
    maximumSignificantDigits: scala.Double,
    minimumFractionDigits: scala.Double,
    minimumIntegerDigits: scala.Double,
    minimumSignificantDigits: scala.Double,
    pluralCategories: js.Array[java.lang.String],
    `type`: stdLib.stdLibStrings.cardinal | stdLib.stdLibStrings.ordinal
  ): ResolvedPluralRulesOptions = {
    val __obj = js.Dynamic.literal(locale = locale, maximumFractionDigits = maximumFractionDigits, maximumSignificantDigits = maximumSignificantDigits, minimumFractionDigits = minimumFractionDigits, minimumIntegerDigits = minimumIntegerDigits, minimumSignificantDigits = minimumSignificantDigits, pluralCategories = pluralCategories, `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolvedPluralRulesOptions]
  }
}

