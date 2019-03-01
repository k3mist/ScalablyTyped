package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlFeatureData extends js.Object {
  var author: KmlAuthor
  var description: java.lang.String
  var id: java.lang.String
  var infoWindowHtml: java.lang.String
  var name: java.lang.String
  var snippet: java.lang.String
}

object KmlFeatureData {
  @scala.inline
  def apply(
    author: KmlAuthor,
    description: java.lang.String,
    id: java.lang.String,
    infoWindowHtml: java.lang.String,
    name: java.lang.String,
    snippet: java.lang.String
  ): KmlFeatureData = {
    val __obj = js.Dynamic.literal(author = author, description = description, id = id, infoWindowHtml = infoWindowHtml, name = name, snippet = snippet)
  
    __obj.asInstanceOf[KmlFeatureData]
  }
}

