package typings
package atUifabricStylingLib.libInterfacesIEffectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEffects extends js.Object {
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * Usually a shadow. This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: search result dropdowns, hover cards, tooltips, help bubbles
    */
  var elevation16: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * Usually a shadow. This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: cards, grid items
    */
  var elevation4: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * Usually a shadow. This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: Panels, Dialogs
    */
  var elevation64: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * Usually a shadow. This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: menus, command surfaces
    */
  var elevation8: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle
  /**
    * How much corners should be rounded, for use with border-radius.
    */
  var roundedCorner2: scala.Double
}

object IEffects {
  @scala.inline
  def apply(
    elevation16: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle,
    elevation4: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle,
    elevation64: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle,
    elevation8: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle,
    roundedCorner2: scala.Double
  ): IEffects = {
    val __obj = js.Dynamic.literal(elevation16 = elevation16, elevation4 = elevation4, elevation64 = elevation64, elevation8 = elevation8, roundedCorner2 = roundedCorner2)
  
    __obj.asInstanceOf[IEffects]
  }
}

