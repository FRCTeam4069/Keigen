package frc.team4069.keigen

import org.ejml.dense.row.CommonOps_DDRM
import org.ejml.dense.row.MatrixFeatures_DDRM
import org.ejml.simple.SimpleMatrix
import org.junit.Assert
import org.junit.Test

class MatrixTest {
    @Test
    fun testMatrixConstruction() {
        val targetMatrix = SimpleMatrix(2, 2, true, doubleArrayOf(1.0, 2.0, 3.0, 4.0))

        val consMatrix = mat(`2`, `2`).fill(1, 2, 3, 4)

        Assert.assertTrue(MatrixFeatures_DDRM.isEquals(targetMatrix.ddrm, consMatrix.storage.ddrm))
    }

    @Test
    fun testMatrixMult() {
        val matA = mat(`2`, `3`).fill(1, 2, 3,
                                             4, 5, 6)

        val matB = mat(`3`, `4`).fill(1, 2, 3, 4,
                                             5, 6, 7, 8,
                                             9, 10, 11, 12)

        val targetMat = mat(`2`, `4`).fill(38, 44, 50, 56,
                                                  83, 98, 113, 128)

        val res = matA * matB

        Assert.assertTrue(MatrixFeatures_DDRM.isEquals(targetMat.storage.ddrm, res.storage.ddrm))
    }

    @Test
    fun testMatVecMult() {
        val m = mat(`2`, `2`).fill(1, 2, 3, 4)
        val v = vec(`2`).fill(5, 6)

        val targetVec = vec(`2`).fill(17, 39)
        val res = m * v

        Assert.assertTrue(MatrixFeatures_DDRM.isEquals(targetVec.storage.ddrm, res.storage.ddrm))
    }
}