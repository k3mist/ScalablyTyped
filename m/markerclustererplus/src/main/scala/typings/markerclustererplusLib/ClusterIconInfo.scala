package typings
package markerclustererplusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *      the object that a <code>calculator</code> function returns.
  *
  *      array to be used to style the cluster icon.
  *      If this value is <code>undefined</code> or <code>""</code>, <code>title</code> is set to the
  *      value of the <code>title</code> property passed to the MarkerClusterer.
  */
trait ClusterIconInfo extends js.Object {
  var index: scala.Double
  var text: java.lang.String
  var title: java.lang.String
}

object ClusterIconInfo {
  @scala.inline
  def apply(index: scala.Double, text: java.lang.String, title: java.lang.String): ClusterIconInfo = {
    val __obj = js.Dynamic.literal(index = index, text = text, title = title)
  
    __obj.asInstanceOf[ClusterIconInfo]
  }
}

