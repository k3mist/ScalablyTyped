package typings
package chaiDashXmlLib.chaiDashXmlMod.ChaiXmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlAssertion
  extends chaiDashXmlLib.chaiDashXmlMod.Global.ChaiNs.Assertion {
  var and: XmlAssertion
  var at: XmlAssertion
  var be: XmlAssertion
  var been: XmlAssertion
  var has: XmlAssertion
  var have: XmlAssertion
  var is: XmlAssertion
  var not: XmlAssertion
  var of: XmlAssertion
  var same: XmlAssertion
  var that: XmlAssertion
  var to: XmlAssertion
  var which: XmlAssertion
  var `with`: XmlAssertion
  def valid(): XmlAssertion
}

object XmlAssertion {
  @scala.inline
  def apply(
    and: XmlAssertion,
    at: XmlAssertion,
    be: XmlAssertion,
    been: XmlAssertion,
    has: XmlAssertion,
    have: XmlAssertion,
    is: XmlAssertion,
    not: XmlAssertion,
    of: XmlAssertion,
    same: XmlAssertion,
    that: XmlAssertion,
    to: XmlAssertion,
    valid: js.Function0[XmlAssertion],
    which: XmlAssertion,
    `with`: XmlAssertion,
    xml: XmlAssertion
  ): XmlAssertion = {
    val __obj = js.Dynamic.literal(and = and, at = at, be = be, been = been, has = has, have = have, is = is, not = not, of = of, same = same, that = that, to = to, valid = valid, which = which, `with` = `with`, xml = xml)
  
    __obj.asInstanceOf[XmlAssertion]
  }
}

