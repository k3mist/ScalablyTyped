package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes options used when searching for query rules
  */
trait SearchRuleOptions extends js.Object {
  /**
    * When specified, restricts matches to rules with a specific anchoring type.
    * When omitted, all anchoring types may match.
    */
  var anchoring: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When specified, restricts matches to contextual rules with a specific context (exact match).
    * When omitted, any generic or contextual rule (with any context) may match.
    */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of hits per page
    * default: 20
    */
  var hitsPerPage: js.UndefOr[scala.Double] = js.undefined
  /**
    * Requested page (zero-based)
    * default: 0
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * The actual search query to find synonyms
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
}

object SearchRuleOptions {
  @scala.inline
  def apply(
    anchoring: java.lang.String = null,
    context: java.lang.String = null,
    hitsPerPage: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    query: java.lang.String = null
  ): SearchRuleOptions = {
    val __obj = js.Dynamic.literal()
    if (anchoring != null) __obj.updateDynamic("anchoring")(anchoring)
    if (context != null) __obj.updateDynamic("context")(context)
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[SearchRuleOptions]
  }
}

