package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeBindings
  extends /**
	 * Option for IgTreeBindings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets the next layer of bindings in a recursive fashion.
  	 *
  	 */
  var bindings: js.UndefOr[IgTreeBindingsBindings] = js.undefined
  /**
  	 * Gets the name of the data source property the value of which would hold the node's
  	 * check state. The check state itself is represented by a string enumeration with the
  	 * checked|partially checked|unchecked states being respectively "on|partial|off".
  	 *
  	 */
  var checkedKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the name of the data source property that holds the child data of the current layer node.
  	 *
  	 */
  var childDataProperty: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the XPath to the child data node. Used in client-only binding directly to XML.
  	 *
  	 */
  var childDataXPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the name of the data source property the value of which would hold the node`s
  	 * expanded state. The expanded state is represented by a boolean.
  	 *
  	 */
  var expandedKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the name of the data source property the value of which would be used as a URL for the node image.
  	 *
  	 */
  var imageUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the XPath to the image URL attribute/node. Used in client-only binding directly to XML.
  	 *
  	 */
  var imageUrlXPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the name of the data source property the value of which would be used as an href attribute for the node anchor.
  	 *
  	 */
  var navigateUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the XPath to the navigate URL attribute/node. Used in client-only binding directly to XML.
  	 *
  	 */
  var navigateUrlXPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the node content template for the current layer of bindings. The igTree utilizes igTemplating
  	 * for generating node content templates. A good example of how to setup templating can be found here http://www.infragistics.com/community/blogs/marina_stoyanova/archive/2014/06/17/how-to-use-templates-to-style-the-different-nodes-of-the-ignite-ui-tree-control.aspx
  	 *
  	 */
  var nodeContentTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the name of the data source property the value of which is the primary key attribute
  	 * for the data. This property is used when load on demand is enabled and if specified the node paths
  	 * would be generated using primary keys instead of indices.
  	 *
  	 */
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the XPath to the root data node. Used in client-only binding directly to XML.
  	 *
  	 */
  var searchFieldXPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the name of the data source property the value of which would be used as a target
  	 * attribute for the node anchor.
  	 *
  	 */
  var targetKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the name of the data source property the value of which would be the node text.
  	 *
  	 */
  var textKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the XPath to the text attribute/node. Used in client-only binding directly to XML.
  	 *
  	 */
  var textXPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the name of the data source property the value of which would be the node value.
  	 *
  	 */
  var valueKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the XPath to the value attribute/node. Used in client-only binding directly to XML.
  	 *
  	 */
  var valueXPath: js.UndefOr[java.lang.String] = js.undefined
}

object IgTreeBindings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTreeBindings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    bindings: IgTreeBindingsBindings = null,
    checkedKey: java.lang.String = null,
    childDataProperty: java.lang.String = null,
    childDataXPath: java.lang.String = null,
    expandedKey: java.lang.String = null,
    imageUrlKey: java.lang.String = null,
    imageUrlXPath: java.lang.String = null,
    navigateUrlKey: java.lang.String = null,
    navigateUrlXPath: java.lang.String = null,
    nodeContentTemplate: java.lang.String = null,
    primaryKey: java.lang.String = null,
    searchFieldXPath: java.lang.String = null,
    targetKey: java.lang.String = null,
    textKey: java.lang.String = null,
    textXPath: java.lang.String = null,
    valueKey: java.lang.String = null,
    valueXPath: java.lang.String = null
  ): IgTreeBindings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (checkedKey != null) __obj.updateDynamic("checkedKey")(checkedKey)
    if (childDataProperty != null) __obj.updateDynamic("childDataProperty")(childDataProperty)
    if (childDataXPath != null) __obj.updateDynamic("childDataXPath")(childDataXPath)
    if (expandedKey != null) __obj.updateDynamic("expandedKey")(expandedKey)
    if (imageUrlKey != null) __obj.updateDynamic("imageUrlKey")(imageUrlKey)
    if (imageUrlXPath != null) __obj.updateDynamic("imageUrlXPath")(imageUrlXPath)
    if (navigateUrlKey != null) __obj.updateDynamic("navigateUrlKey")(navigateUrlKey)
    if (navigateUrlXPath != null) __obj.updateDynamic("navigateUrlXPath")(navigateUrlXPath)
    if (nodeContentTemplate != null) __obj.updateDynamic("nodeContentTemplate")(nodeContentTemplate)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (searchFieldXPath != null) __obj.updateDynamic("searchFieldXPath")(searchFieldXPath)
    if (targetKey != null) __obj.updateDynamic("targetKey")(targetKey)
    if (textKey != null) __obj.updateDynamic("textKey")(textKey)
    if (textXPath != null) __obj.updateDynamic("textXPath")(textXPath)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    if (valueXPath != null) __obj.updateDynamic("valueXPath")(valueXPath)
    __obj.asInstanceOf[IgTreeBindings]
  }
}

