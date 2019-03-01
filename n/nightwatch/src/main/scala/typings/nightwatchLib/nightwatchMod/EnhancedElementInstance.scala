package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedElementInstance extends js.Object {
  /**
    * The locate strategy to be used with `selector` when finding the element within the DOM.
    */
  var locateStrategy: java.lang.String
  /**
    * The name of the element as defined by its key in the parent section or the page object's `elements` definition.
    * This is the same name used with the `@` prefix in selector arguments for page object commands that refer to the element.
    */
  var name: java.lang.String
  /**
    * A reference to the parent object instance.
    * This is the parent section or the page object that contained the definition for this object.
    */
  var parent: EnhancedPageObject
  /**
    * The selector string used to find the element in the DOM.
    */
  var selector: java.lang.String
}

object EnhancedElementInstance {
  @scala.inline
  def apply(
    locateStrategy: java.lang.String,
    name: java.lang.String,
    parent: EnhancedPageObject,
    selector: java.lang.String
  ): EnhancedElementInstance = {
    val __obj = js.Dynamic.literal(locateStrategy = locateStrategy, name = name, parent = parent, selector = selector)
  
    __obj.asInstanceOf[EnhancedElementInstance]
  }
}

