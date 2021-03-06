package typings
package titaniumLib.TitaniumNs.NetworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Cookie object used to manage the system cookie store and HTTP client cookie store.
		 */
trait Cookie
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The comment describing the purpose of this cookie
  			 */
  var comment: java.lang.String
  /**
  			 * The domain attribute of the cookie.
  			 */
  var domain: java.lang.String
  /**
  			 * The expiration Date of the cookie.
  			 */
  var expiryDate: java.lang.String
  /**
  			 * The httponly attribute of the cookie.
  			 */
  var httponly: scala.Boolean
  /**
  			 * Sets the Max-Age attribute of a Cookie, in delta-seconds.
  			 */
  var maxAge: scala.Double
  /**
  			 * The name of the cookie.
  			 */
  val name: java.lang.String
  /**
  			 * The origual url attribute of the cookie.
  			 */
  var originalUrl: java.lang.String
  /**
  			 * The path attribute of the cookie.
  			 */
  var path: java.lang.String
  /**
  			 * The secure attribute of the cookie.
  			 */
  var secure: scala.Boolean
  /**
  			 * The value of the cookie.
  			 */
  var value: java.lang.String
  /**
  			 * The version of the cookie specification to which this cookie conforms.
  			 */
  var version: scala.Double
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.comment> property.
  			 */
  def getComment(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.domain> property.
  			 */
  def getDomain(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.expiryDate> property.
  			 */
  def getExpiryDate(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.httponly> property.
  			 */
  def getHttponly(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.maxAge> property.
  			 */
  def getMaxAge(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.name> property.
  			 */
  def getName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.originalUrl> property.
  			 */
  def getOriginalUrl(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.path> property.
  			 */
  def getPath(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.secure> property.
  			 */
  def getSecure(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.value> property.
  			 */
  def getValue(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.version> property.
  			 */
  def getVersion(): scala.Double
  /**
  			 * Returns true if the cookie is valid.
  			 */
  def isValid(): scala.Boolean
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.comment> property.
  			 */
  def setComment(comment: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.domain> property.
  			 */
  def setDomain(domain: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.expiryDate> property.
  			 */
  def setExpiryDate(expiryDate: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.httponly> property.
  			 */
  def setHttponly(httponly: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.maxAge> property.
  			 */
  def setMaxAge(maxAge: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.originalUrl> property.
  			 */
  def setOriginalUrl(originalUrl: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.path> property.
  			 */
  def setPath(path: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.secure> property.
  			 */
  def setSecure(secure: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.value> property.
  			 */
  def setValue(value: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.version> property.
  			 */
  def setVersion(version: scala.Double): scala.Unit
}

object Cookie {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    comment: java.lang.String,
    domain: java.lang.String,
    expiryDate: java.lang.String,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getComment: () => java.lang.String,
    getDomain: () => java.lang.String,
    getExpiryDate: () => java.lang.String,
    getHttponly: () => scala.Boolean,
    getMaxAge: () => scala.Double,
    getName: () => java.lang.String,
    getOriginalUrl: () => java.lang.String,
    getPath: () => java.lang.String,
    getSecure: () => scala.Boolean,
    getValue: () => java.lang.String,
    getVersion: () => scala.Double,
    httponly: scala.Boolean,
    isValid: () => scala.Boolean,
    maxAge: scala.Double,
    name: java.lang.String,
    originalUrl: java.lang.String,
    path: java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    secure: scala.Boolean,
    setBubbleParent: scala.Boolean => scala.Unit,
    setComment: java.lang.String => scala.Unit,
    setDomain: java.lang.String => scala.Unit,
    setExpiryDate: java.lang.String => scala.Unit,
    setHttponly: scala.Boolean => scala.Unit,
    setMaxAge: scala.Double => scala.Unit,
    setOriginalUrl: java.lang.String => scala.Unit,
    setPath: java.lang.String => scala.Unit,
    setSecure: scala.Boolean => scala.Unit,
    setValue: java.lang.String => scala.Unit,
    setVersion: scala.Double => scala.Unit,
    value: java.lang.String,
    version: scala.Double,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, comment = comment, domain = domain, expiryDate = expiryDate, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getComment = js.Any.fromFunction0(getComment), getDomain = js.Any.fromFunction0(getDomain), getExpiryDate = js.Any.fromFunction0(getExpiryDate), getHttponly = js.Any.fromFunction0(getHttponly), getMaxAge = js.Any.fromFunction0(getMaxAge), getName = js.Any.fromFunction0(getName), getOriginalUrl = js.Any.fromFunction0(getOriginalUrl), getPath = js.Any.fromFunction0(getPath), getSecure = js.Any.fromFunction0(getSecure), getValue = js.Any.fromFunction0(getValue), getVersion = js.Any.fromFunction0(getVersion), httponly = httponly, isValid = js.Any.fromFunction0(isValid), maxAge = maxAge, name = name, originalUrl = originalUrl, path = path, removeEventListener = js.Any.fromFunction2(removeEventListener), secure = secure, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setComment = js.Any.fromFunction1(setComment), setDomain = js.Any.fromFunction1(setDomain), setExpiryDate = js.Any.fromFunction1(setExpiryDate), setHttponly = js.Any.fromFunction1(setHttponly), setMaxAge = js.Any.fromFunction1(setMaxAge), setOriginalUrl = js.Any.fromFunction1(setOriginalUrl), setPath = js.Any.fromFunction1(setPath), setSecure = js.Any.fromFunction1(setSecure), setValue = js.Any.fromFunction1(setValue), setVersion = js.Any.fromFunction1(setVersion), value = value, version = version)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Cookie]
  }
}

