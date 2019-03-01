package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basename extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var chunk: js.UndefOr[js.Any] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var hash: js.UndefOr[js.Any] = js.undefined
  var query: js.UndefOr[js.Any] = js.undefined
}

object Anon_Basename {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    chunk: js.Any = null,
    filename: java.lang.String = null,
    hash: js.Any = null,
    query: js.Any = null
  ): Anon_Basename = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (chunk != null) __obj.updateDynamic("chunk")(chunk)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_Basename]
  }
}

