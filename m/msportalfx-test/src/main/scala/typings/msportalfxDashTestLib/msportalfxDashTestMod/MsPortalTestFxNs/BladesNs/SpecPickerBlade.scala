package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecPickerBlade extends Blade {
  def pickSpec(specCode: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit]
}

object SpecPickerBlade {
  @scala.inline
  def apply(
    baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    click: () => qLib.qMod.QNs.Promise[scala.Unit],
    clickCommand: java.lang.String => qLib.qMod.QNs.Promise[Blade],
    getAttribute: java.lang.String => qLib.qMod.QNs.Promise[java.lang.String],
    getLocator: () => msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    getText: () => qLib.qMod.QNs.Promise[java.lang.String],
    getTiles: () => qLib.qMod.QNs.Promise[
      js.Array[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PartsNs.Tile]
    ],
    isDisplayed: () => qLib.qMod.QNs.Promise[scala.Boolean],
    isElementPresent: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator => qLib.qMod.QNs.Promise[scala.Boolean],
    isPresent: () => qLib.qMod.QNs.Promise[scala.Boolean],
    parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    pickSpec: java.lang.String => qLib.qMod.QNs.Promise[scala.Unit],
    rightClick: () => qLib.qMod.QNs.Promise[scala.Unit],
    sendKeys: /* repeated */ java.lang.String => qLib.qMod.QNs.Promise[scala.Unit],
    title: java.lang.String
  ): SpecPickerBlade = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = js.Any.fromFunction0(click), clickCommand = js.Any.fromFunction1(clickCommand), getAttribute = js.Any.fromFunction1(getAttribute), getLocator = js.Any.fromFunction0(getLocator), getText = js.Any.fromFunction0(getText), getTiles = js.Any.fromFunction0(getTiles), isDisplayed = js.Any.fromFunction0(isDisplayed), isElementPresent = js.Any.fromFunction1(isElementPresent), isPresent = js.Any.fromFunction0(isPresent), parentLocator = parentLocator, pickSpec = js.Any.fromFunction1(pickSpec), rightClick = js.Any.fromFunction0(rightClick), sendKeys = js.Any.fromFunction1(sendKeys), title = title)
  
    __obj.asInstanceOf[SpecPickerBlade]
  }
}

