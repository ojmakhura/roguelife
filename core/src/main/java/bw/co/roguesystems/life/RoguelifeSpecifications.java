package bw.co.roguesystems.life;

import java.util.Collection;

import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.CriteriaBuilder.In;

public class RoguelifeSpecifications {

    public static <E, T>Specification<E> findByAttributeNull(String attribute) {
        return (root, cq, cb) -> {
            
            return cb.isNull(root.<T>get(attribute));
        };
    }

    public static <E, T>Specification<E> findByAttributeNotNull(String attribute) {
        return (root, cq, cb) -> {
            
            return cb.isNotNull(root.<T>get(attribute));
        };
    }

    public static <E, T>Specification<E> findByAttribute(String attribute, T attributeValue) {
        return (root, cq, cb) -> {
            
            return cb.equal(root.<T>get(attribute), attributeValue);
        };
    }

    public static <E, T>Specification<E> findByAttributeNotEqual(String attribute, T attributeValue) {
        return (root, cq, cb) -> {
            
            return cb.notEqual(root.<T>get(attribute), attributeValue);
        };
    }

    public static <E, T>Specification<E> findByAttributeNotMember(String attribute, T attributeValue) {
        return (root, cq, cb) -> {
            
            return cb.isNotMember(attributeValue, root.get(attribute));
        };
    }

    public static <E, T>Specification<E> findByAttributeIsMember(String attribute, T attributeValue) {
        return (root, cq, cb) -> {
            
            return cb.isMember(attributeValue, root.get(attribute));
        };
    }

    public static <E>Specification<E> findByAttributeIsEmpty(String attribute) {
        return (root, cq, cb) -> {
            
            return cb.isEmpty(root.get(attribute));
        };
    }

    public static <E>Specification<E> findByAttributeIsNotEmpty(String attribute) {
        return (root, cq, cb) -> {
            
            return cb.isNotEmpty(root.get(attribute));
        };
    }

    public static <E>Specification<E> findByAttributeFalse(String attribute){
        return (root, cq, cb) -> {
            
            return cb.isFalse(root.<Boolean>get(attribute));
        };
    }

    public static <E>Specification<E> findByAttributeTrue(String attribute){
        return (root, cq, cb) -> {
            
            return cb.isTrue(root.<Boolean>get(attribute));
        };
    }

    public static <E>Specification<E> findByAttributeStartingWithIgnoreCase(String attribute, String attributeValue){
        return (root, cq, cb) -> {
            
            return cb.like(cb.upper(root.<String>get(attribute)), attributeValue.toUpperCase() + "%");
        };
    }
    
    public static <E>Specification<E> findByAttributeEndingWithIgnoreCase(String attribute, String attributeValue){
        return (root, cq, cb) -> {
            
            return cb.like(cb.upper(root.<String>get(attribute)), "%" + attributeValue.toUpperCase());
        };
    }
    
    public static <E>Specification<E> findByAttributeContainingIgnoreCase(String attribute, String attributeValue){
        return (root, cq, cb) -> {
            
            return cb.like(cb.upper(root.<String>get(attribute)), "%" + attributeValue.toUpperCase() + "%");
        };
    }
    
    public static <E>Specification<E> findByAttributeLikeIgnoreCase(String attribute, String attributeValue){
        return (root, cq, cb) -> {
            
            return cb.like(cb.upper(root.<String>get(attribute)), "%" + attributeValue.toUpperCase() + "%");
        };
    }
    
    public static <E>Specification<E> findByAttributeNotLikeIgnoreCase(String attribute, String attributeValue){
        return (root, cq, cb) -> {
            
            return cb.notLike(cb.upper(root.<String>get(attribute)), "%" + attributeValue.toUpperCase() + "%");
        };
    }
    
    public static <E>Specification<E> findByAttributeContaining(String attribute, String attributeValue){
        return (root, cq, cb) -> {
            
            return cb.like(root.<String>get(attribute), "%" + attributeValue.toUpperCase() + "%");
        };
    }

    public static <E, T extends Comparable<? super T>>Specification<E> findByAttributeLessThan(String attribute, T attributeValue){
        return (root, cq, cb) -> {
            
            return cb.lessThan(root.<T>get(attribute), attributeValue);
        };
    }
    
    public static <E, T extends Comparable<? super T>>Specification<E> findByAttributeLessThanEqual(String attribute, T attributeValue){
        return (root, cq, cb) -> {
            
            return cb.lessThanOrEqualTo(root.<T>get(attribute), attributeValue);
        };
    }
    
    public static <E, T extends Comparable<? super T>>Specification<E> findByAttributeGreaterThan(String attribute, T attributeValue){
        return (root, cq, cb) -> {
            
            return cb.greaterThan(root.<T>get(attribute), attributeValue);
        };
    }
    
    public static <E, T extends Comparable<? super T>>Specification<E> findByAttributeGreaterThanEqual(String attribute, T attributeValue){
        return (root, cq, cb) -> {
            
            return cb.greaterThanOrEqualTo(root.<T>get(attribute), attributeValue);
        };
    }
    
    public static <E, T extends Comparable<? super T>>Specification<E> findByAttributeBetween(String attribute, T attributeStart, T attributeEnd){
        return (root, cq, cb) -> {
            
            return cb.between(root.<T>get(attribute), attributeStart, attributeEnd);
        };
    }

    public static <E, T>Specification<E> findByAttributeIn(String attribute, Collection<T> proprertyIn){

        return (root, cq, cb) -> {

            return cb.in(root.get(attribute)).value(proprertyIn);
        };
    }

    public static <E, J>Specification<E> findByJoinAttributeLike(String joinAttribute, String attribute, String attributeValue) {

        return (root, cq, cb) -> {
            Join<E, J> join = root.join(joinAttribute);
            return cb.like(cb.upper(join.get(attribute)), attributeValue );
        };
    }
    
    public static <E, J>Specification<E> findByJoinAttributeContainingIgnoreCase(String joinAttribute, String attribute, String attributeValue){
        return (root, cq, cb) -> {
            
            Join<E, J> join = root.join(joinAttribute);
            return cb.like(cb.upper(join.<String>get(attribute)), "%" + attributeValue.toUpperCase() + "%");
        };
    }

    public static <E, J>Specification<E> findByJoinAttributeStartsWith(String joinAttribute, String attribute, String attributeValue) {

        return (root, cq, cb) -> {
            Join<E, J> join = root.join(joinAttribute);
            return cb.like(join.get(attribute), attributeValue + "%");
        };
    }

    public static <E, J>Specification<E> findByJoinAttributeEndsWith(String joinAttribute, String attribute, String attributeValue) {

        return (root, cq, cb) -> {
            Join<E, J> join = root.join(joinAttribute);
            
            return cb.like(join.get(attribute), "%" + attributeValue);
        };
    }

    public static <E, J, T>Specification<E> findByJoinAttribute(String joinAttribute, String attribute, T attributeValue) {

        return (root, cq, cb) -> {
            Join<E, J> join = root.join(joinAttribute);
            return cb.equal(join.get(attribute), attributeValue);
        };
    }

    public static <E, J, T extends Comparable<? super T>>Specification<E> findByJoinAttributeLessThan(String joinAttribute, String attribute, T attributeValue) {

        return (root, cq, cb) -> {
            Join<E, J> join = root.join(joinAttribute);
            return cb.lessThan(join.<T>get(attribute), attributeValue);
        };
    }

    public static <E, J, T extends Comparable<? super T>>Specification<E> findByJoinAttributeGreaterThan(String joinAttribute, String attribute, T attributeValue) {

        return (root, cq, cb) -> {
            Join<E, J> join = root.join(joinAttribute);
            return cb.greaterThan(join.<T>get(attribute), attributeValue);
        };
    }

    public static <E, J, T>Specification<E> findByJoinAttributeNotMember(String joinAttribute, String attribute, T attributeValue) {
        return (root, cq, cb) -> {
            
            Join<E, J> join = root.join(joinAttribute);
            return cb.isNotMember(attributeValue, join.get(attribute));
        };
    }

    public static <E, J, T>Specification<E> findByJoinAttributeIsMember(String joinAttribute, String attribute, T attributeValue) {
        return (root, cq, cb) -> {
            
            Join<E, J> join = root.join(joinAttribute);
            return cb.isMember(attributeValue, join.get(attribute));
        };
    }

    public static <E, J>Specification<E> findByJoinAttributeIsEmpty(String joinAttribute, String attribute) {
        return (root, cq, cb) -> {
            
            Join<E, J> join = root.join(joinAttribute);
            return cb.isEmpty(join.get(attribute));
        };
    }

    public static <E, J>Specification<E> findByJoinAttributeIsNotEmpty(String joinAttribute, String attribute) {
        return (root, cq, cb) -> {
            
            Join<E, J> join = root.join(joinAttribute);
            return cb.isNotEmpty(join.get(attribute));
        };
    }

    public static <E, J, T>Specification<E> findByJoinAttributeIn(String joinAttribute, String attribute, Collection<T> attributeValues) {
        return (root, cq, cb) -> {
            
            Join<E, J> join = root.join(joinAttribute);
            In<T> in = cb.in(join.<T>get(attribute));
            attributeValues.forEach(v -> in.value(v));
            return in;
        };
    }

    public static <E, J>Specification<E> findByJoinAttributeIdNull(String joinAttribute, String attribute) {
        return (root, cq, cb) -> {
            
            Join<E, J> join = root.join(joinAttribute);
            return cb.isNull(join.<E>get(attribute));
        };
    }

    public static <E, J>Specification<E> findByJoinAttributeNotNull(String joinAttribute, String attribute) {
        return (root, cq, cb) -> {
            Join<E, J> join = root.join(joinAttribute);
            return cb.isNotNull(join.<E>get(attribute));
        };
    }

    public static <E, J1, J2, T>Specification<E> findByJoinAttribute(String joinAttribute1, String joinAttribute2, String attribute, T attributeValue) {

        return (root, cq, cb) -> {
            Join<E, J1> join1 = root.join(joinAttribute1);
            Join<E, J2> join2 = join1.join(joinAttribute2);
            return cb.equal(join2.<E>get(attribute), attributeValue);
        };
    }

    public static <E, J1, J2, T>Specification<E> findByJoinAttributeIn(String joinAttribute1, String joinAttribute2, String attribute, Collection<T> attributeValues) {

        return (root, cq, cb) -> {
            Join<E, J1> join1 = root.join(joinAttribute1);
            Join<E, J2> join2 = join1.join(joinAttribute2);
            In<T> in = cb.in(join2.<T>get(attribute));
            attributeValues.forEach(v -> in.value(v));
            return in;
        };
    }
}