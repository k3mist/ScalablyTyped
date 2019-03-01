package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lang extends js.Object {
  /** The language of the information url and description. */
  var lang: js.UndefOr[java.lang.String] = js.undefined
  /** The URL for the preview image information. */
  var previewImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The description for this location. */
  var snippet: js.UndefOr[java.lang.String] = js.undefined
  /** The URL for information for this location. Ex: wikipedia link. */
  var snippetUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The display title and localized canonical name to use when searching for this entity on Google search. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Lang {
  @scala.inline
  def apply(
    lang: java.lang.String = null,
    previewImageUrl: java.lang.String = null,
    snippet: java.lang.String = null,
    snippetUrl: java.lang.String = null,
    title: java.lang.String = null
  ): Anon_Lang = {
    val __obj = js.Dynamic.literal()
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (previewImageUrl != null) __obj.updateDynamic("previewImageUrl")(previewImageUrl)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (snippetUrl != null) __obj.updateDynamic("snippetUrl")(snippetUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Lang]
  }
}

