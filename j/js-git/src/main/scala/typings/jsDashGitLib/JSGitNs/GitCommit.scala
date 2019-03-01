package typings
package jsDashGitLib.JSGitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommit extends js.Object {
  var author: GitAuthor
  var message: java.lang.String
  var tree: java.lang.String
}

object GitCommit {
  @scala.inline
  def apply(author: GitAuthor, message: java.lang.String, tree: java.lang.String): GitCommit = {
    val __obj = js.Dynamic.literal(author = author, message = message, tree = tree)
  
    __obj.asInstanceOf[GitCommit]
  }
}

