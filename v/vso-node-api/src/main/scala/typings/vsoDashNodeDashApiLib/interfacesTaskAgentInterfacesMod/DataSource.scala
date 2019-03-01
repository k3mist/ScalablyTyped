package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  var endpointUrl: java.lang.String
  var name: java.lang.String
  var resultSelector: java.lang.String
}

object DataSource {
  @scala.inline
  def apply(endpointUrl: java.lang.String, name: java.lang.String, resultSelector: java.lang.String): DataSource = {
    val __obj = js.Dynamic.literal(endpointUrl = endpointUrl, name = name, resultSelector = resultSelector)
  
    __obj.asInstanceOf[DataSource]
  }
}

