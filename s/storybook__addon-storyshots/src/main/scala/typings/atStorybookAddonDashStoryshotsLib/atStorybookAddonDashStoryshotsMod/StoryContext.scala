package typings
package atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryContext extends js.Object {
  var kind: java.lang.String
  var story: java.lang.String
}

object StoryContext {
  @scala.inline
  def apply(kind: java.lang.String, story: java.lang.String): StoryContext = {
    val __obj = js.Dynamic.literal(kind = kind, story = story)
  
    __obj.asInstanceOf[StoryContext]
  }
}

