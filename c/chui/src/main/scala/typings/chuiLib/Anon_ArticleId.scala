package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArticleId extends js.Object {
  var articleId: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var results: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ArticleId {
  @scala.inline
  def apply(
    articleId: js.Any = null,
    id: java.lang.String = null,
    placeholder: java.lang.String = null,
    results: scala.Int | scala.Double = null
  ): Anon_ArticleId = {
    val __obj = js.Dynamic.literal()
    if (articleId != null) __obj.updateDynamic("articleId")(articleId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArticleId]
  }
}

