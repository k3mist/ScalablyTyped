package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webdriverioLib {
  // Browser commands wrapper with Promise
  type BrowserAsync = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof webdriverio.BrowserPromise ]: webdriver.WrapWithPromise<webdriverio.WebdriverIO.Browser[K]>}
    */ webdriverioLib.webdriverioLibStrings.BrowserAsync with webdriverioLib.WebdriverIONs.Browser
  type BrowserObject = webdriverLib.WebDriverNs.ClientOptions with webdriverLib.WebDriverNs.ClientAsync with webdriverioLib.WebdriverIOAsyncNs.Browser
  // Browser commands that should be wrapper with Promise
  type BrowserPromise = webdriverLib.Omit[
    webdriverioLib.WebdriverIONs.Browser, 
    webdriverioLib.webdriverioLibStrings.addCommand | webdriverioLib.webdriverioLibStrings.options
  ]
  // Browser commands that should not be wrapper with promise
  type BrowserStatic = stdLib.Pick[
    webdriverioLib.WebdriverIONs.Browser, 
    webdriverioLib.webdriverioLibStrings.addCommand | webdriverioLib.webdriverioLibStrings.options
  ]
  // Element commands wrapper with Promise
  type ElementAsync = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof webdriverio.ElementPromise ]: webdriver.WrapWithPromise<webdriverio.WebdriverIO.Element[K]>}
    */ webdriverioLib.webdriverioLibStrings.ElementAsync with webdriverioLib.WebdriverIONs.Element
  // Element commands that should be wrapper with Promise
  type ElementPromise = webdriverLib.Omit[
    webdriverioLib.WebdriverIONs.Element, 
    webdriverioLib.webdriverioLibStrings.addCommand
  ]
  // Element commands that should not be wrapper with promise
  type ElementStatic = stdLib.Pick[
    webdriverioLib.WebdriverIONs.Element, 
    webdriverioLib.webdriverioLibStrings.addCommand
  ]
}
