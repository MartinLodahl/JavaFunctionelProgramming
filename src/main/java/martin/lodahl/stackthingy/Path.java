/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martin.lodahl.stackthingy;

/**
 *
 * @author MartinLodahl
 */
public interface Path<T> {
    T getFirst();
    Path<T> getRest();
}
