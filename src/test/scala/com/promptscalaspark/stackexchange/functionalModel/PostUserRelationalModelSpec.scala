/*
 * Copyright © 2019 Abhishek Verma (abhishekv3007@gmail.com)
 *
 *                    GNU AFFERO GENERAL PUBLIC LICENSE
 *                       Version 3, 19 November 2007
 * Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 * Everyone is permitted to copy and distribute verbatim copies
 * of this license document, but changing it is not allowed.
 *                            Preamble
 *
 *   The GNU Affero General Public License is a free, copyleft license for
 * software and other kinds of works, specifically designed to ensure
 * cooperation with the community in the case of network server software.
 *
 *   The licenses for most software and other practical works are designed
 * to take away your freedom to share and change the works.  By contrast,
 * our General Public Licenses are intended to guarantee your freedom to
 * share and change all versions of a program--to make sure it remains free
 * software for all its users.
 */

package com.promptscalaspark.stackexchange.functionalModel

import com.promptscalaspark.stackexchange.SparkSpec
import org.scalatest.{FunSpec, GivenWhenThen, Matchers}

class PostUserRelationalModelSpec
  extends FunSpec with PostUserRelationalModel
    with SparkSpec
    with GivenWhenThen
    with Matchers {

  val resourcePath: String =
    getClass.getClassLoader.getResource("StackExchangeTestData").getPath

  it("should check all the column numbers for userBadges dataset") {
    userPostVotes(resourcePath + "/*/","/home/xargus/testResults")  shouldBe 5
  }
}
