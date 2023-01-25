package training.restapi.repository;

import training.restapi.domain.Member;
import training.restapi.domain.Video;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface VideoRepository {
    void enroll(Video video);
    Optional<Video> findById(Long id);
    Stream<Video> findByUsername(String userName);
}
