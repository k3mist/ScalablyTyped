package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Site extends js.Object {
  var categories: Model[hexoLib.hexoMod.HexoNs.LocalsNs.Category]
  var data: org.scalablytyped.runtime.StringDictionary[js.Any]
  var pages: Model[hexoLib.hexoMod.HexoNs.LocalsNs.Page]
  var posts: Model[hexoLib.hexoMod.HexoNs.LocalsNs.Post]
  var tags: Model[hexoLib.hexoMod.HexoNs.LocalsNs.Tag]
}

object Site {
  @scala.inline
  def apply(
    categories: Model[hexoLib.hexoMod.HexoNs.LocalsNs.Category],
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    pages: Model[hexoLib.hexoMod.HexoNs.LocalsNs.Page],
    posts: Model[hexoLib.hexoMod.HexoNs.LocalsNs.Post],
    tags: Model[hexoLib.hexoMod.HexoNs.LocalsNs.Tag]
  ): Site = {
    val __obj = js.Dynamic.literal(categories = categories, data = data, pages = pages, posts = posts, tags = tags)
  
    __obj.asInstanceOf[Site]
  }
}

