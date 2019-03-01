package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestQueryInput extends js.Object {
  /**
    * The list of commit IDs to search for.
    */
  var items: js.Array[java.lang.String]
  /**
    * The type of query to perform.
    */
  var `type`: GitPullRequestQueryType
}

object GitPullRequestQueryInput {
  @scala.inline
  def apply(items: js.Array[java.lang.String], `type`: GitPullRequestQueryType): GitPullRequestQueryInput = {
    val __obj = js.Dynamic.literal(items = items, `type` = `type`)
  
    __obj.asInstanceOf[GitPullRequestQueryInput]
  }
}

