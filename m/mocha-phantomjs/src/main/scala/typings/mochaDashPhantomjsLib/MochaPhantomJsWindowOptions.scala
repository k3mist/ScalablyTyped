package typings
package mochaDashPhantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPhantomJsWindowOptions extends Window {
  var ended: scala.Boolean
  var env: js.Any
  var failures: scala.Double
  var started: scala.Boolean
  def run(): scala.Unit
}

object MochaPhantomJsWindowOptions {
  @scala.inline
  def apply(
    ended: scala.Boolean,
    env: js.Any,
    failures: scala.Double,
    mochaPhantomJS: js.Function0[MochaPhantomJsWindowOptions],
    run: js.Function0[scala.Unit],
    started: scala.Boolean
  ): MochaPhantomJsWindowOptions = {
    val __obj = js.Dynamic.literal(ended = ended, env = env, failures = failures, mochaPhantomJS = mochaPhantomJS, run = run, started = started)
  
    __obj.asInstanceOf[MochaPhantomJsWindowOptions]
  }
}

