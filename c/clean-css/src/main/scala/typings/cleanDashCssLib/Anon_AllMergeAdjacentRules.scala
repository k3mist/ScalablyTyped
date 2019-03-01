package typings
package cleanDashCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllMergeAdjacentRules extends js.Object {
  /**
    * Sets all optimizations at this level unless otherwise specified
    */
  var all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls adjacent rules merging; defaults to true
    */
  var mergeAdjacentRules: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls merging properties into shorthands; defaults to true
    */
  var mergeIntoShorthands: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls `@media` merging; defaults to true
    */
  var mergeMedia: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls non-adjacent rule merging; defaults to true
    */
  var mergeNonAdjacentRules: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls semantic merging; defaults to false
    */
  var mergeSemantically: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls property overriding based on understandably; defaults to true
    */
  var overrideProperties: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls non-adjacent rule reducing; defaults to true
    */
  var reduceNonAdjacentRules: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls duplicate `@font-face` removing; defaults to true
    */
  var removeDuplicateFontRules: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls duplicate `@media` removing; defaults to true
    */
  var removeDuplicateMediaBlocks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls duplicate rules removing; defaults to true
    */
  var removeDuplicateRules: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls removing empty rules and nested blocks; defaults to `true`
    */
  var removeEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls unused at rule removing; defaults to false (available since 4.1.0)
    */
  var removeUnusedAtRules: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls rule restructuring; defaults to false
    */
  var restructureRules: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls which properties won't be optimized, defaults to `[]` which means all will be optimized (since 4.1.0)
    */
  var skipProperties: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_AllMergeAdjacentRules {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    mergeAdjacentRules: js.UndefOr[scala.Boolean] = js.undefined,
    mergeIntoShorthands: js.UndefOr[scala.Boolean] = js.undefined,
    mergeMedia: js.UndefOr[scala.Boolean] = js.undefined,
    mergeNonAdjacentRules: js.UndefOr[scala.Boolean] = js.undefined,
    mergeSemantically: js.UndefOr[scala.Boolean] = js.undefined,
    overrideProperties: js.UndefOr[scala.Boolean] = js.undefined,
    reduceNonAdjacentRules: js.UndefOr[scala.Boolean] = js.undefined,
    removeDuplicateFontRules: js.UndefOr[scala.Boolean] = js.undefined,
    removeDuplicateMediaBlocks: js.UndefOr[scala.Boolean] = js.undefined,
    removeDuplicateRules: js.UndefOr[scala.Boolean] = js.undefined,
    removeEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    removeUnusedAtRules: js.UndefOr[scala.Boolean] = js.undefined,
    restructureRules: js.UndefOr[scala.Boolean] = js.undefined,
    skipProperties: js.Array[java.lang.String] = null
  ): Anon_AllMergeAdjacentRules = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(mergeAdjacentRules)) __obj.updateDynamic("mergeAdjacentRules")(mergeAdjacentRules)
    if (!js.isUndefined(mergeIntoShorthands)) __obj.updateDynamic("mergeIntoShorthands")(mergeIntoShorthands)
    if (!js.isUndefined(mergeMedia)) __obj.updateDynamic("mergeMedia")(mergeMedia)
    if (!js.isUndefined(mergeNonAdjacentRules)) __obj.updateDynamic("mergeNonAdjacentRules")(mergeNonAdjacentRules)
    if (!js.isUndefined(mergeSemantically)) __obj.updateDynamic("mergeSemantically")(mergeSemantically)
    if (!js.isUndefined(overrideProperties)) __obj.updateDynamic("overrideProperties")(overrideProperties)
    if (!js.isUndefined(reduceNonAdjacentRules)) __obj.updateDynamic("reduceNonAdjacentRules")(reduceNonAdjacentRules)
    if (!js.isUndefined(removeDuplicateFontRules)) __obj.updateDynamic("removeDuplicateFontRules")(removeDuplicateFontRules)
    if (!js.isUndefined(removeDuplicateMediaBlocks)) __obj.updateDynamic("removeDuplicateMediaBlocks")(removeDuplicateMediaBlocks)
    if (!js.isUndefined(removeDuplicateRules)) __obj.updateDynamic("removeDuplicateRules")(removeDuplicateRules)
    if (!js.isUndefined(removeEmpty)) __obj.updateDynamic("removeEmpty")(removeEmpty)
    if (!js.isUndefined(removeUnusedAtRules)) __obj.updateDynamic("removeUnusedAtRules")(removeUnusedAtRules)
    if (!js.isUndefined(restructureRules)) __obj.updateDynamic("restructureRules")(restructureRules)
    if (skipProperties != null) __obj.updateDynamic("skipProperties")(skipProperties)
    __obj.asInstanceOf[Anon_AllMergeAdjacentRules]
  }
}

