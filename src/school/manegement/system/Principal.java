/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.manegement.system;

/**
 *
 * @author Yehya Adam
 */
public class Principal extends Employee {
    private float principalBonus;

    public Principal() {
    }

    public Principal(float principalBonus) {
        this.principalBonus = principalBonus;
    }

    public void setPrincipalBonus(float principalBonus) {
        this.principalBonus = principalBonus;
    }

    public float getPrincipalBonus() {
        return principalBonus;
    }

    @Override
    public String toString() {
        return "Principal{" + "principalBonus=" + principalBonus + '}';
    }
    
    public  float getSalary()
    {
    return (float) (this.basicSalary + this.liveExpensive + this.principalBonus);
    }
}
