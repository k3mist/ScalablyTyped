package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseShallowReference extends js.Object {
  /**
    * Gets the links to related resources, APIs, and views for the release.
    */
  var _links: js.Any
  /**
    * Gets the unique identifier of release.
    */
  var id: scala.Double
  /**
    * Gets or sets the name of the release.
    */
  var name: java.lang.String
  /**
    * Gets the REST API url to access the release.
    */
  var url: java.lang.String
}

object ReleaseShallowReference {
  @scala.inline
  def apply(_links: js.Any, id: scala.Double, name: java.lang.String, url: java.lang.String): ReleaseShallowReference = {
    val __obj = js.Dynamic.literal(_links = _links, id = id, name = name, url = url)
  
    __obj.asInstanceOf[ReleaseShallowReference]
  }
}

