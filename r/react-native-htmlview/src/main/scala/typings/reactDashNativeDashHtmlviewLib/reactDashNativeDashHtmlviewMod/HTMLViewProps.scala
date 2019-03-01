package typings
package reactDashNativeDashHtmlviewLib.reactDashNativeDashHtmlviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLViewProps extends js.Object {
  /*
    * The component used for rendering HTML element nodes
    */
  var NodeComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[js.Object]] = js.undefined
  /*
    * The root wrapper component
    */
  var RootComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[js.Object]] = js.undefined
  /*
    * The component used for rendering text element nodes
    */
  var TextComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[js.Object]] = js.undefined
  /**
    *  When explicitly false, effectively sets paragraphBreak and lineBreak to null
    */
  var addLineBreaks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text which is rendered before every li inside a ul
    */
  var bullet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text which appears after text elements which create a new line (br, headings)
    */
  var lineBreak: js.UndefOr[java.lang.String] = js.undefined
  /*
    * Properties for the NodeComponent, can be used independently from NodeComponent
    */
  var nodeComponentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any
  ] = js.undefined
  var onLinkLongPress: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.undefined
  var onLinkPress: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Text which appears after every p element
    */
  var paragraphBreak: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * A custom function to render HTML nodes however you see fit. If the function returns undefined (not null), the
    * default renderer will be used for that node. The function takes the following arguments:
    *
    *  - defaultRenderer the default rendering implementation, so you can use the normal rendering logic for some subtree. defaultRenderer takes the following arguments:
    *     - node the node to render with the default rendering logic
    *     - parent the parent of node of node
    *
    * @param node the html node as parsed by htmlparser2
    * @param index position of the node in parent node's children
    * @param siblings parent node's children (including current node)
    * @param parent parent node
    * @param defaultRenderer the default rendering implementation, so you can use the normal rendering logic for some subtree:
    */
  var renderNode: js.UndefOr[
    js.Function5[
      /* node */ HTMLViewNode, 
      /* index */ scala.Double, 
      /* siblings */ HTMLViewNode, 
      /* parent */ HTMLViewNode, 
      /* defaultRenderer */ js.Function2[
        /* node */ HTMLViewNode, 
        /* parent */ HTMLViewNode, 
        reactLib.reactMod.ReactNs.ReactNode
      ], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /*
    * Properties for the RootComponent, can be used independently from RootComponent
    */
  var rootComponentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any
  ] = js.undefined
  var stylesheet: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      reactDashNativeLib.reactDashNativeMod.StyleProp[
        reactDashNativeLib.reactDashNativeMod.ViewStyle | reactDashNativeLib.reactDashNativeMod.TextStyle | reactDashNativeLib.reactDashNativeMod.ImageStyle
      ]
    ]
  ] = js.undefined
  /*
    * Properties for the TextComponent, can be used independently from TextComponent
    */
  var textComponentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any
  ] = js.undefined
  /**
    * a string of HTML content to render
    */
  var value: java.lang.String
}

object HTMLViewProps {
  @scala.inline
  def apply(
    value: java.lang.String,
    NodeComponent: reactLib.reactMod.ReactNs.ComponentType[js.Object] = null,
    RootComponent: reactLib.reactMod.ReactNs.ComponentType[js.Object] = null,
    TextComponent: reactLib.reactMod.ReactNs.ComponentType[js.Object] = null,
    addLineBreaks: js.UndefOr[scala.Boolean] = js.undefined,
    bullet: java.lang.String = null,
    lineBreak: java.lang.String = null,
    nodeComponentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any = null,
    onLinkLongPress: js.Function1[/* url */ java.lang.String, scala.Unit] = null,
    onLinkPress: js.Function1[/* url */ java.lang.String, scala.Unit] = null,
    paragraphBreak: java.lang.String = null,
    renderNode: js.Function5[
      /* node */ HTMLViewNode, 
      /* index */ scala.Double, 
      /* siblings */ HTMLViewNode, 
      /* parent */ HTMLViewNode, 
      /* defaultRenderer */ js.Function2[
        /* node */ HTMLViewNode, 
        /* parent */ HTMLViewNode, 
        reactLib.reactMod.ReactNs.ReactNode
      ], 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    rootComponentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any = null,
    stylesheet: org.scalablytyped.runtime.StringDictionary[
      reactDashNativeLib.reactDashNativeMod.StyleProp[
        reactDashNativeLib.reactDashNativeMod.ViewStyle | reactDashNativeLib.reactDashNativeMod.TextStyle | reactDashNativeLib.reactDashNativeMod.ImageStyle
      ]
    ] = null,
    textComponentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any = null
  ): HTMLViewProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (NodeComponent != null) __obj.updateDynamic("NodeComponent")(NodeComponent.asInstanceOf[js.Any])
    if (RootComponent != null) __obj.updateDynamic("RootComponent")(RootComponent.asInstanceOf[js.Any])
    if (TextComponent != null) __obj.updateDynamic("TextComponent")(TextComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(addLineBreaks)) __obj.updateDynamic("addLineBreaks")(addLineBreaks)
    if (bullet != null) __obj.updateDynamic("bullet")(bullet)
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(lineBreak)
    if (nodeComponentProps != null) __obj.updateDynamic("nodeComponentProps")(nodeComponentProps)
    if (onLinkLongPress != null) __obj.updateDynamic("onLinkLongPress")(onLinkLongPress)
    if (onLinkPress != null) __obj.updateDynamic("onLinkPress")(onLinkPress)
    if (paragraphBreak != null) __obj.updateDynamic("paragraphBreak")(paragraphBreak)
    if (renderNode != null) __obj.updateDynamic("renderNode")(renderNode)
    if (rootComponentProps != null) __obj.updateDynamic("rootComponentProps")(rootComponentProps)
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet)
    if (textComponentProps != null) __obj.updateDynamic("textComponentProps")(textComponentProps)
    __obj.asInstanceOf[HTMLViewProps]
  }
}

